package models.segundoParcial2023;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="dia_de_entrenamiento")
public class DiaDeEntrenamiento {
    @Id @GeneratedValue
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "dia_de_entrenamiento_ejercicio",
            joinColumns = @JoinColumn(name = "dia_de_entrenamiento_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ejercicio_id", referencedColumnName = "id")
    )
    private List<Ejercicio> ejercicios;
    @Column(name="numero", columnDefinition="INTEGER")
    private Integer numero;
}
