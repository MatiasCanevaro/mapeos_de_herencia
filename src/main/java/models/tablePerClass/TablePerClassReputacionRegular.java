package models.tablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "table_per_class_reputacion_regular")
public class TablePerClassReputacionRegular extends TablePerClassReputacion {
    @Column
    private String tres;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
