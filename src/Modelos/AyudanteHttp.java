package Modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AyudanteHttp {
    private static String manejarRequest(String direccion){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        }catch(IOException | InterruptedException e){
            System.out.println("Hubo un error de conexion");
            return null;
        }

    }

    public static TablaDeConversion pedirTabla(String direccion){
        JsonObject jsonObject = JsonParser.parseString(manejarRequest(direccion)).getAsJsonObject();
        jsonObject = jsonObject.getAsJsonObject("conversion_rates");
        Gson gson = new GsonBuilder().setFieldNamingStrategy(new EstrategiaMayuscula()).create();
        return gson.fromJson(jsonObject, TablaDeConversion.class);
    }
}
