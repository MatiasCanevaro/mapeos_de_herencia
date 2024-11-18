package models.segundoParcial2022;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)

public class MedioComunicacionConverter implements AttributeConverter<MedioDeComunicacion,String> {
    @Override
    public String convertToDatabaseColumn(MedioDeComunicacion tipo){
        if(tipo instanceof Whatsapp){
            return "wpp";
        }
        else if(tipo instanceof Telegram){
            return "telegram";
        }
        else if(tipo instanceof Email){
            return "email";
        }
        return null;
    }

    @Override
    public MedioDeComunicacion convertToEntityAttribute(String dbData) {
        if ("wpp".equals(dbData)) {
            return new Whatsapp();
        } else if ("telegram".equals(dbData)) {
            return new Telegram();
        }
        else if ("email".equals(dbData)) {
            return new Email();
        }
        return null;
    }
}
