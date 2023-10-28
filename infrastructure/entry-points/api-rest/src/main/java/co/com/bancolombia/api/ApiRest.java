package co.com.bancolombia.api;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import co.com.bancolombia.usecase.animales.AnimalesUseCase;
import co.com.bancolombia.model.animales.Animales;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@ResponseBody
    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private AnimalesUseCase animalesUseCase;

    @GetMapping(path = "/animales/{nombreAnimal}")
    public Animales read(@PathVariable String nombraAnimal) {
        return animalesUseCase.read(nombraAnimal);
    }

    @PostMapping(path = "/animales")
    public void create(@RequestBody Animales animales) {
        animalesUseCase.create(animales);
    }

    @PutMapping(path = "/animales/{nombreAnimal}")
    public void update(@PathVariable String nombreAnimal,@RequestBody Animales animales){
        try {
            animalesUseCase.update(nombreAnimal,animales);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }
    @DeleteMapping(path="/animales/{nombreAnimal}")
    public void delete (@PathVariable String nombreAnimal){ animalesUseCase.delete(nombreAnimal);}

    @GetMapping(path="/animales")
    public List<Animales> getAll() {return animalesUseCase.getAll();}
}
