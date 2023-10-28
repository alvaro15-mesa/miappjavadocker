package co.com.bancolombia.jpa.entities;
import jdk.jfr.Enabled;
import lombok.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="animales")
public class AnimalEntities {

    @Id
    private String nombreAnimal;
    @Column
    private String especieAnimal;
    @Column
    private Integer numeroPatas;
    @Column
    private Character generoAnimal;
    @Column
    private String habitad;
    @Column
    private Boolean domestico;
}
