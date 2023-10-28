package co.com.bancolombia.jpa;
import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class JpaAnimalImpl implements  AnimalesRepository{
    private JPARepositoryAdapter jpaRepositoryAdapter;
    @Override
    public void create (Animales animales){
        //String Animalx = UUID.randomUUID().toString();
        //animales.setAnimalnom(Animalx);
        jpaRepositoryAdapter.save(animales);
    }
    @Override
    public Animales read(String animalnom){
        return jpaRepositoryAdapter.findById(animalnom);
    }
    @Override
    public void update(String nombreAnimal,Animales animales) throws Exception{
        Animales animales1 = jpaRepositoryAdapter.findById(nombreAnimal);
        if(animales1 == null) {throw new Exception("Animal no found"+nombreAnimal);}
        animales1.setNombreAnimal(animales.getNombreAnimal());
        //animales1.setAnimalnom(animales.getAnimalnom());
        animales1.setEspecieAnimal(animales.getEspecieAnimal());
        //animales1.setEspecie(animales.getEspecie());
        animales1.setNumeroPatas(animales.getNumeroPatas());
        animales1.setGeneroAnimal(animales.getGeneroAnimal());
        //animales1.setGeneroAnm(animales.getGeneroAnm());
        animales1.setHabitad(animales.getHabitad());
        animales1.setDomestico(animales.getDomestico());
        jpaRepositoryAdapter.save(animales1);
    }
    @Override
    public void delete(String animalNombre){
        jpaRepositoryAdapter.deleteById(animalNombre);
    }

    @Override
    public List<Animales> getAll(){
        return jpaRepositoryAdapter.findAll();
    }

}
