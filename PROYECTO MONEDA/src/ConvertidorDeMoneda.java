import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConvertidorDeMoneda {


    private static final String API_URL = "https://v6.exchangerate-api.com/v6/8be74e8efc98d6c6b0397a6f/latest/";


    public static String obtenerDatosDeCambio(String monedaBase) {
        try {

            URL url = new URL(API_URL + monedaBase);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String inputLine;
            StringBuilder respuesta = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                respuesta.append(inputLine);
            }
            in.close();


            return respuesta.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static double obtenerTasaDeCambio(String monedaBase) {
        String respuesta = obtenerDatosDeCambio(monedaBase);
        if (respuesta != null) {
            JsonObject json = JsonParser.parseString(respuesta).getAsJsonObject();
            return json.getAsJsonObject("conversion_rates").get("USD").getAsDouble();
        }
        return 0;
    }



}
