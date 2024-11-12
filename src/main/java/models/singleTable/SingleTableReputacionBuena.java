package models.singleTable;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("buena")
public class SingleTableReputacionBuena extends SingleTableReputacion {
    @Column
    private String dos;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
