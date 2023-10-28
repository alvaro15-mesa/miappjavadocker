package co.com.bancolombia.model.animales;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Animales {
    private String nombreAnimal;
    private String especieAnimal;
    private Integer numeroPatas;
    private Character generoAnimal;
    private String habitad;
    private Boolean domestico;

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public Character getGeneroAnimal() {
        return generoAnimal;
    }

    public void setGeneroAnimal(Character generoAnimal) {
        this.generoAnimal = generoAnimal;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }
}
