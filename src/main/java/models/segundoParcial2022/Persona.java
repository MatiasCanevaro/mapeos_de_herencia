package models.segundoParcial2022;

import javax.persistence.*;

@Entity
@Table(name="persona")
@DiscriminatorColumn(name="tipo")
public abstract class Persona implements Contactable{
    @Id @GeneratedValue
    private Long id;
    @Column(name="cuit_cuil")
    private String cuitCuil;
    @OneToOne
    @JoinColumn(name="direccion_id", referencedColumnName = "id")
    private Direccion direccion;
    @Convert(converter = MedioComunicacionConverter.class)
    @Column(name = "medio_Comunicacion")
    private MedioDeComunicacion medioDeComunicacion;

    @Override
    public String emailPreferido() {
        return null;
    }

    @Override
    public String numeroPreferido() {
        return null;
    }
}
