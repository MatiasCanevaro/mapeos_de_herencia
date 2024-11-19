package models.segundoParcial2023;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

public class Mantener extends Motivacion{
    @Override
    public Rutina generarRutinaPara(Deportista deportista) {
        return null;
    }
}
