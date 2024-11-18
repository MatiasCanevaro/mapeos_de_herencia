package models.segundoParcial2022;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("persona_juridica")
public class PersonaJuridica extends Persona{
    @Column(name="razon_social")
    private String razonSocial;
    @Column(name="fecha_constitucion",columnDefinition = "DATE")
    private LocalDate fechaConstitucion;
    @ElementCollection
    @CollectionTable(name = "persona_emails", joinColumns = @JoinColumn(name =
            "persona_id"))
    @Column(name = "email")
    private List<String> emailsDeContacto;
    @ElementCollection
    @CollectionTable(name = "persona_telefonos", joinColumns = @JoinColumn(name =
            "persona_id"))
    @Column(name = "telefono")
    private List<String> telefonosDeContacto;
}
