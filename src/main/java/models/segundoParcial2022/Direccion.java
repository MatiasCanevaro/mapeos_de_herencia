package models.segundoParcial2022;

import javax.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="altura", columnDefinition = "INTEGER")
    private String altura;
    @Column(name="calle")
    private String calle;
    @Column(name="localidad_barrio")
    private String localidadBarrio;
    @Column(name="municipio_comuna")
    private String municipioComuna;
    @Column(name="provincia")
    private String provincia;
}
