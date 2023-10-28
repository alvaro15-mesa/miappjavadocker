package co.com.bancolombia.model.animales.gateways;
import co.com.bancolombia.model.animales.*;
import java.util.*;
public interface AnimalesRepository {
    void create (Animales animales);
    Animales read (String nombreAnimal);
    default void update (String nombreAnimal, Animales animales) throws Exception{}
    void delete  (String nombreAnimal);
    List<Animales> getAll();
}
