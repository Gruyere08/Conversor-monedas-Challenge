import Modelos.AyudanteHttp;
import Modelos.ConversorDeMonedas;
import Modelos.TablaDeConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("###########Conversor de monedas###########");
        System.out.println("Especifique la moneda que desea ingresar");
        String menu = """
                1. Peso argentino
                2. Boliviano
                3. Real Brasileño
                4. Peso Chileno
                5. Peso Colombiano
                6. Dolar EstadoUnidense
                7. salir
                Tu opcion: 
                """;
        while(true){
            System.out.println(menu);
            opcion = teclado.nextInt();
            if (opcion == 7){
                System.exit(0);
            } else {

            }
        }
        String monedaInicial = teclado.nextLine();
        String monedaFinal = "usd";
        double monto = 0;
        try {
            ConversorDeMonedas.convertirMoneda(monedaInicial,monedaFinal,monto);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        //TablaDeConversion tablaDeConversion = AyudanteHttp.pedirTabla("https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/USD");
    }
}
