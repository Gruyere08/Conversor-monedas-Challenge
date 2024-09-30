package Modelos;

import java.lang.reflect.Field;

public class ConversorDeMonedas {
    public static double convertirMoneda(String monedaInicial, String monedaFinal, double monto){
        String direccion = "https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/" + monedaInicial.toUpperCase();
        TablaDeConversion tabla = AyudanteHttp.pedirTabla(direccion);
        System.out.println(tabla);
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
