package models.singleTable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "single_table")
@DiscriminatorColumn(name = "tipo")
public abstract class SingleTableReputacion {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String uno;

    public abstract void recibirCalificacion();
}
