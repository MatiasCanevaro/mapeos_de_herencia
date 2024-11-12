package models.mappedSuperclass;

import javax.persistence.*;

@MappedSuperclass
public abstract class MappedSuperclassReputacion {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    public abstract void recibirCalificacion();
}

