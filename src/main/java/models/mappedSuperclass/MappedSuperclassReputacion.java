package models.mappedSuperclass;

import javax.persistence.*;

@MappedSuperclass
public abstract class MappedSuperclassReputacion {
    @Id
    @GeneratedValue
    private Long id;

    public abstract void recibirCalificacion();
}

