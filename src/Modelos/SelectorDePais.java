package Modelos;

public class SelectorDePais {
    public static String obtenerPais(int numeroDeOpcion){
        return switch (numeroDeOpcion) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> "XXX";
        };
    }



    public static String obtenerNombre(String codigoPais){
        return switch (codigoPais) {
            case "ARS" -> "Pesos argentinos";
            case "BOB" -> "Bolivianos";
            case "BRL" -> "Reales brasileños";
            case "CLP" -> "Pesos chilenos";
            case "COP" -> "Pesos colombianos";
            case "USD" -> "Dolares Estadounidenses";
            default -> "Moneda desconocida";
        };
    }
}
