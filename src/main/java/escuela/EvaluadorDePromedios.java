package escuela;


import java.util.List;

public class EvaluadorDePromedios {
    public double evalua(List<Double> calificaciones) {
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
}
