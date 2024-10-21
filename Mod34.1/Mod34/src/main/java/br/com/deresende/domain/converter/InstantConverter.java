package br.com.deresende.domain.converter;

import java.time.Instant;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class InstantConverter implements AttributeConverter<Instant, String>{

    @Override
    public String convertToDatabaseColumn(Instant attribute) {
        return attribute.toString();
    }

    @Override
    public Instant convertToEntityAttribute(String dbData) {
        return Instant.parse(dbData);
    }

}
