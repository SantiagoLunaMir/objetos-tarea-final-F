package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

import algoritmoX.*;
import escuela.EvaluadorDePromedios;
import escuela.EvaluadorDePromediosAdapter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
    @Test
    public void testQueVerificaelFuncionamientoGeneral(){
        // Given:
        Contactos contactos = new Contactos();
        // When:
        MarcaCelular marca1 = new MarcaCelular("Samsung");
        MarcaCelular marca2 = new MarcaCelular("Apple");

        NumeroTelefonico numero1 = new NumeroTelefonico(123456789);
        NumeroTelefonico numero2 = new NumeroTelefonico(987654321);

        contactos.agregarContacto(numero1, "Juan");
        contactos.agregarContacto(numero2, "Maria");
        // Then:
        assertThat(marca1.getNombre()).isEqualTo("Samsung");
        assertThat(marca2.getNombre()).isEqualTo("Apple");

        assertThat(numero1.getNumero()).isEqualTo(123456789);
        assertThat(numero2.getNumero()).isEqualTo(987654321);

        assertThat(contactos.obtenerContacto(numero1)).isEqualTo("Juan");
        assertThat(contactos.obtenerContacto(numero2)).isEqualTo("Maria");
    }
}