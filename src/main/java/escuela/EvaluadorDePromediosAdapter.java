package escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        List<Double> calificaciones = parseCalificaciones(listaDeCalificaciones);
        return evaluadorDePromedios.evalua(calificaciones);
    }

    private List<Double> parseCalificaciones(String listaDeCalificaciones) {
        return Arrays.stream(listaDeCalificaciones.split(","))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        /*String[] calificacionesArray = listaDeCalificaciones.split(",");
        List<Double> calificaciones = new ArrayList<>();
        for (String calificacionStr : calificacionesArray) {
            double calificacion = Double.parseDouble(calificacionStr);
            calificaciones.add(calificacion);
        }
        return calificaciones;*/
    }
}
