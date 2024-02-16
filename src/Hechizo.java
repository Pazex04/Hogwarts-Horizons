import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hechizo {
    int id;
    String nombre;
    String efecto;
    int nivelDificultad;
    public Hechizo(int idHechizo){
        String content;
        id = idHechizo;
        try {
            URL res = getClass().getClassLoader().getResource("db.json");
            Path path = Paths.get(res.toURI());
            content = new String(Files.readAllBytes(path));
            JSONObject data = new JSONObject(content);
            JSONArray hechizos = data.getJSONArray("hechizos");

            for (int i = 0; i < hechizos.length(); i++) {
                JSONObject hechizo = hechizos.getJSONObject(i);
                if (hechizo.getInt("id") == idHechizo) {
                    this.nombre = hechizo.getString("hechizo");
                    this.efecto = hechizo.getString("uso");
                    this.nivelDificultad = hechizo.getInt("nivel");
                    break;
                }
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
