package Modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AyudanteHistorial {

    public static void registrar(String monedaInicial, String monedaFinal, double monto, double resultado) {
        try (FileWriter writer = new FileWriter("Historial.txt", true)) {

            LocalDateTime tiempoActual = LocalDateTime.now();
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String tiempoFormateado = tiempoActual.format(formateador);
            writer.write("Fecha y hora: " + tiempoFormateado + "\n");

            DecimalFormat decimalFormat = new DecimalFormat("#.####");

            writer.write(SelectorDePais.obtenerNombre(monedaInicial) + " --> " + SelectorDePais.obtenerNombre(monedaFinal) + "\n");
            writer.write(decimalFormat.format(monto) + " --> " + decimalFormat.format(resultado) + "\n");
            writer.write("\n");

        } catch (IOException e) {
            System.out.println("No se pudo escribir en el historial");
        }
    }
}
