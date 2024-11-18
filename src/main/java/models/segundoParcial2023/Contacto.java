package models.segundoParcial2023;

import javax.persistence.*;

@Entity
@Table(name="contacto")
public class Contacto {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name="tipo_contacto")
    private TipoContacto tipoContacto;
    @Column(name="contenido")
    private String contenido;
}
