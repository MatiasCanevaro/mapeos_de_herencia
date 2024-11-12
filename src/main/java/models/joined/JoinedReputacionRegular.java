package models.joined;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("regular")
@Table(name = "joined_reputacion_regular")
public class JoinedReputacionRegular extends JoinedReputacion {
    @Column
    private String tres;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
