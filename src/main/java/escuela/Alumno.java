package escuela;

import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    private Alumno() {
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public static AlumnoBuilder builder() {
        return new AlumnoBuilder();
    }

    public static class AlumnoBuilder {
        private Alumno alumno;

        private AlumnoBuilder() {
            alumno = new Alumno();
        }

        public AlumnoBuilder nombre(String nombre) {
            alumno.nombre = nombre;
            return this;
        }

        public AlumnoBuilder clave(String clave) {
            alumno.clave = clave;
            return this;
        }

        public AlumnoBuilder claveDeCarrera(String claveDeCarrera) {
            alumno.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public AlumnoBuilder anioDeIngreso(int anioDeIngreso) {
            alumno.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public AlumnoBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            alumno.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return alumno;
        }
    }
}
