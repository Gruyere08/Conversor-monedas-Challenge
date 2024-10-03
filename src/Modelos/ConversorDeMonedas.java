package Modelos;

import java.lang.reflect.Field;

public class ConversorDeMonedas {
    public static double convertirMoneda(String monedaInicial, String monedaFinal, double monto) throws NoSuchFieldException, IllegalAccessException {
        String direccion = "https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/" + monedaInicial.toUpperCase();
        TablaDeConversion tabla = AyudanteHttp.pedirTabla(direccion);
        double multiplicador = obtenerValorCampo(tabla , monedaFinal);
        System.out.println("Tabla:" + tabla);
        System.out.println("Multiplicador: " + multiplicador);
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
