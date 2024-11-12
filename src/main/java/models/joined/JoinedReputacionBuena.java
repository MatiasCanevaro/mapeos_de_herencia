package models.joined;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("buena")
@Table(name = "joined_reputacion_buena")
public class JoinedReputacionBuena extends JoinedReputacion {
    @Column
    private String dos;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
