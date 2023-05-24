package algoritmoX;

import java.util.HashMap;
import java.util.Map;
public class Contactos implements Dependencia3{
    private Map<NumeroTelefonico, String> contactos;

    public Contactos() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(NumeroTelefonico numero, String nombreContacto) {
        contactos.put(numero, nombreContacto);
    }

    public String obtenerContacto(NumeroTelefonico numero) {
        return contactos.get(numero);
    }
}

