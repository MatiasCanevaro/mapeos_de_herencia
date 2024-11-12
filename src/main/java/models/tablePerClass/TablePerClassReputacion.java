package models.tablePerClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class TablePerClassReputacion {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) //IMPORTANTE: es para que no se repitan los ids entre las clases hijas
    private Long id;
    @Column
    private String uno;
    public abstract void recibirCalificacion();
}
