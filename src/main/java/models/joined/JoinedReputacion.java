package models.joined;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "joined_reputacion")
@DiscriminatorColumn(name = "tipo")
public abstract class JoinedReputacion {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) //IMPORTANTE: es para que no se repitan los ids entre las clases hijas
    private Long id;
    @Column
    private String uno;
    public abstract void recibirCalificacion();
}
