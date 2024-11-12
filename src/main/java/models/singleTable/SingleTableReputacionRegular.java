package models.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("regular")
public class SingleTableReputacionRegular extends SingleTableReputacion {
    @Column
    private String tres;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
