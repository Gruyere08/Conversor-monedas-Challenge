import Modelos.AyudanteHttp;
import Modelos.ConversorDeMonedas;
import Modelos.TablaDeConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String monedaInicial = teclado.nextLine();
        String monedaFinal = "";
        double monto = 0;
        ConversorDeMonedas.convertirMoneda(monedaInicial,monedaFinal,monto);

        //TablaDeConversion tablaDeConversion = AyudanteHttp.pedirTabla("https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/USD");
    }
}
