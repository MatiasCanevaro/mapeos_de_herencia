package models.segundoParcial2023;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BajarDePeso extends Motivacion{
    @Override
    public Rutina generarRutinaPara(Deportista deportista) {
        return null;
    }
}
