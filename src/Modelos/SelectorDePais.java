package Modelos;

public class SelectorDePais {
    public static String obtenerPais(int numeroDeOpcion){
        switch (numeroDeOpcion){
            case 1:
                return "ARS";
            case 2:
                return "BOB";
            case 3:
                return "BRL";
            case 4:
                return "CLP";
            case 5:
                return "COP";
            case 6:
                return "USD";
            default:
                return "XXX";
        }
    }
}
