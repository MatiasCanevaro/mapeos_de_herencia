package models.joined;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("mala")
@Table(name = "joined_reputacion_mala")
public class JoinedReputacionMala extends JoinedReputacion {
    @Column
    private String cuatro;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
