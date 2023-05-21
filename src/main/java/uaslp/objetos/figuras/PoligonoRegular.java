package uaslp.objetos.figuras;

import uaslp.objetos.figuras.exceptions.DatoFaltanteException;
import uaslp.objetos.figuras.exceptions.NumeroInvalidoDeLados;

import static java.lang.Math.sqrt;

public class PoligonoRegular implements Figura,DrawableItem{
    private int numeroDeLados;
    private double lado=-1,hipotenusa,ladoChico;
    private double apotema;
    private double area;
    public String getName() {
        return "Poligono Regular";
    }


    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados {

        if(lado<=4)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        if(lado<0)
            throw new NumeroInvalidoDeLados();
        this.numeroDeLados=numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getArea() {//sqrt raiz,math.pow(num,2) cuadrado,lado medida indv
        hipotenusa=Math.pow(lado,2);
        ladoChico=Math.pow((lado/2),2);
        apotema=Math.sqrt(hipotenusa-ladoChico);
        return area=((lado*numeroDeLados)*apotema)/2;
    }

    public double getLado() {
        return lado;
    }
}
