package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;
    private double area;

    public Cuadrado(double lado) {
        this.lado=lado;
    }

    public Cuadrado() {

    }

    void setLado(double lado){
        this.lado = lado;
    }

    public double getArea() {
        return area=lado*lado;
    }

    public double getLado() {
        return lado;
    }
}
