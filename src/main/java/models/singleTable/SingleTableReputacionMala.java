package models.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("mala")
public class SingleTableReputacionMala extends SingleTableReputacion {
    @Column
    private String cuatro;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
