package uaslp.objetos.figuras;

public class Triangulo implements Figura,DrawableItem{
    public Triangulo() {
    }
    private double base;
    private double area;
    private double altura;
    private String description="Cualquier triangulo";
    public Triangulo(double base, double altura) {
        this.altura=altura;
        this.base=base;
    }

    public Triangulo(String description) {
        this.description=description;
    }

    public String getName() {
        return "Triangulo";
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

    public String getDescription() {
    return description;
    }
}
