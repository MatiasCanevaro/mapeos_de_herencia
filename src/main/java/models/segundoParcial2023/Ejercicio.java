package models.segundoParcial2023;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="detalle")
    private String detalle;
    @Column(name="nombre")
    private String nombre;
    @ManyToMany
    @JoinTable(
            name = "ejercicio_que_combina",
            joinColumns = @JoinColumn(name = "ejercicio_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ejercicio_que_combina_id", referencedColumnName = "id")
    )
    private List<Ejercicio> ejerciciosQueCombinan;
}
