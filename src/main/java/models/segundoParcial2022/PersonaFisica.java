package models.segundoParcial2022;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("persona_fisica")
public class PersonaFisica extends Persona{
    @Column(name="apellido")
    private String apellido;
    @Column(name="nombre")
    private String nombre;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    @Column(name="fecha_nacimiento",columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
}
