package uaslp.objetos.figuras;

import uaslp.objetos.figuras.exceptions.DatoFaltanteException;
import uaslp.objetos.figuras.exceptions.LadoNoProvistoException;

public class Cuadrado implements Figura,DrawableItem {

    private double lado=-1;
    private double area;

    public Cuadrado(double lado){
        this.lado=lado;
    }

    public Cuadrado(){
    }

    void setLado(double lado){
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public double getArea() throws LadoNoProvistoException{
            if (lado < 0) {
                throw new LadoNoProvistoException();
            }
            return area = lado * lado;
    }



    @Override
    public String getName() {
        return "Cuadrado";
    }
}
