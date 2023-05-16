package uaslp.objetos.figuras;

public class Triangulo {
    private double base;
    private double area;
    private double altura;
    public Triangulo(double base, double altura) {
        this.altura=altura;
        this.base=base;
    }

    public Triangulo() {

    }

    public void setBase(double base) {
        this.base=base;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public double getArea() {
        return area=(base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
