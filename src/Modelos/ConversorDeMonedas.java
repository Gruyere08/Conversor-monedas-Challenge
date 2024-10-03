package Modelos;

import java.lang.reflect.Field;

public class ConversorDeMonedas {
    public static double convertirMoneda(String monedaInicial, String monedaFinal, double monto) {
        String direccion = "https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/" + monedaInicial.toUpperCase();
        TablaDeConversion tabla = AyudanteHttp.pedirTabla(direccion);
        double multiplicador = obtenerValorCampo(tabla , monedaFinal.toLowerCase());
        return monto * multiplicador;
    }



    private static double obtenerValorCampo(TablaDeConversion tablaDeConversion, String nombreCampo) {
        Class<?> recordClass = tablaDeConversion.getClass();
        Field field;
        try {
            field = recordClass.getDeclaredField(nombreCampo);
            field.setAccessible(true);
            return (double) field.get(tablaDeConversion);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Ocurrio un error inesperado");
            return -1;
        }

    }
}
