package models.tablePerClass;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "table_per_class_reputacion_buena")
public class TablePerClassReputacionBuena extends TablePerClassReputacion {
    @Column
    private String dos;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
