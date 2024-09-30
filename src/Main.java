import Modelos.AyudanteHttp;

public class Main {
    public static void main(String[] args) {
        System.out.println(AyudanteHttp.pedirTabla("https://v6.exchangerate-api.com/v6/a9aeaee58a78bcadcb370047/latest/USD"));
    }
}
