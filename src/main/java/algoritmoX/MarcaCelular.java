package algoritmoX;

public class MarcaCelular implements Dependencia1{
    private String nombre;

    public MarcaCelular(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
