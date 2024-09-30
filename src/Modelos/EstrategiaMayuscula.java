package Modelos;

import com.google.gson.FieldNamingStrategy;

import java.lang.reflect.Field;

public class EstrategiaMayuscula implements FieldNamingStrategy {

    @Override
    public String translateName(Field field) {
        return field.getName().toUpperCase();
    }
}
