package escuela;

import java.util.HashMap;
import java.util.Map;

public class SalaDeJuntasFactory {
    private static Map<String, SalaDeJuntas> salasDeJuntas = new HashMap<>();

    public static SalaDeJuntas get(String nombre) {
        SalaDeJuntas salaDeJuntas = salasDeJuntas.get(nombre);

        if (salaDeJuntas == null) {
            salaDeJuntas = new SalaDeJuntas(nombre);
            salasDeJuntas.put(nombre, salaDeJuntas);
        }

        return salaDeJuntas;
    }
}