package models.mappedSuperclass;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mapped_superclass_reputacion_buena")
public class MappedSuperclassReputacionBuena extends MappedSuperclassReputacion {
    @Column
    private String dos;

    @Override
    public void recibirCalificacion() {
        //TODO
    }
}
