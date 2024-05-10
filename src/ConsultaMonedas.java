import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
        public Monedas convertirMoneda() {


            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7c136646354ae7faf18c29aa/latest/USD");

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()

                    .uri(direccion)
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                return new Gson().fromJson(response.body(), Monedas.class);
            } catch (Exception e) {
                throw new RuntimeException("No se pudo realizar la conversión.");
            }}    }