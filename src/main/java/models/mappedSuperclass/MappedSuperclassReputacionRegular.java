package models.mappedSuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mapped_superclass_reputacion_regular")
public class MappedSuperclassReputacionRegular extends MappedSuperclassReputacion {
    @Column
    private String tres;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
