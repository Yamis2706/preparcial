package co.edu.uniquindio.preparcial.ejercicio2;


import co.edu.uniquindio.preparcial.model.Atraccion;
import co.edu.uniquindio.preparcial.model.Curso;


public class MainEjercicio2 {
    public static void main(String[] args) {
        Atraccion atraccion = inicializaDatosPrueba();

        /*solicitar información de la atracción*/
        atraccion.mostrarInformacionAtraccion();


        /*Validar rango edad*/
        string subirAtraccion = atraccion.validarRangoedad();


    }

    private static Atraccion inicializaDatosPrueba() {
       Atraccion atraccion1 = crearAtraccion( "Krater", "De 8:00 am a 5:00 pm",
               "montaña rusa de fuerte impacto y diseño con grandes elevaciones",
               "Adulto, Adolescente, niño", "Alto", 1000);
       Atraccion atraccion2 = crearAtraccion();
    }


    private static Atraccion crearAtraccion(String nombre, String horarioOperacion, String descripcion,
                                                          String rangoEdad, String nivelPeligro, int pesoMaximo){

        Atraccion atraccion = new Atraccion();
        atraccion.setNombre(nombre);
        atraccion.setHorarioOperacion(horarioOperacion);
        atraccion.setDescripcion(descripcion);
        atraccion.setRangoEdad(rangoEdad);
        atraccion.setNivelPeligro(nivelPeligro);
        atraccion.setPesoMaximo(pesoMaximo);

        return atraccion;
    }

    }
