package models.segundoParcial2023;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="deportista")
public class Deportista {
    @Id @GeneratedValue
    private Long id;
    @Column(name="altura", columnDefinition="DOUBLE")
    private Double altura;
    @Column(name="apellido")
    private String apellido;
    @ManyToMany
    @JoinTable(
            name = "deportista_contacto",
            joinColumns = @JoinColumn(name = "deportista_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "contacto_id", referencedColumnName = "id")
    )
    private List<Contacto> contactos;
    @Convert(converter = MotivacionConverter.class)
    @Column(name = "tipo")
    private Motivacion motivacionPrincipal;
    @Column(name="nombre")
    private String nombre;
    @Column(name="peso_inicial", columnDefinition="DECIMAL")
    private Double pesoInicial;

}
