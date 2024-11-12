package models.mappedSuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mapped_superclass_reputacion_mala")
public class MappedSuperclassReputacionMala extends MappedSuperclassReputacion {
    @Column
    private String cuatro;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
