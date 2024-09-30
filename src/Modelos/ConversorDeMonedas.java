package Modelos;

import java.lang.reflect.Field;

public class ConversorDeMonedas {
    public static double convertirMoneda(String monedaInicial, String monedaFinal, double monto){
        return 0;
    }



    private static double obtenerValorCampo(TablaDeConversion tablaDeConversion, String nombreCampo)
            throws NoSuchFieldException, IllegalAccessException {
        Class<?> recordClass = tablaDeConversion.getClass();
        Field field = recordClass.getDeclaredField(nombreCampo);
        field.setAccessible(true);
        return (double) field.get(tablaDeConversion);
    }
}
