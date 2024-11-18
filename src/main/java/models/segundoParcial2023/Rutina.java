package models.segundoParcial2023;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="rutina")
public class Rutina {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="deportista_id", referencedColumnName = "id")
    private Deportista deportista;
    @OneToMany
    @JoinColumn(name="rutina_id", referencedColumnName = "id")
    private List<DiaDeEntrenamiento> dias;
}
