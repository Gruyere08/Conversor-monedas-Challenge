import Modelos.AyudanteHttp;
import Modelos.ConversorDeMonedas;
import Modelos.TablaDeConversion;

public class Main {
    public static void main(String[] args) {
        TablaDeConversion tablaDeConversion = AyudanteHttp.pedirTabla("https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/USD");
    }
}
