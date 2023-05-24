package algoritmoX;

public class MarcaCelular implements Dependencia1{
    private String nombre;
    public MarcaCelular(){}

    public void setMarca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
