package co.edu.uniquindio.preparcial.ejercicio2;

import co.edu.uniquindio.preparcial.model.Atraccion;
import co.edu.uniquindio.preparcial.model.Visitante;

public class MainEjercicio2 {
    public static void main(String[] args) {
        inicializaDatosPrueba();

    }

    public static void inicializaDatosPrueba() {
       Atraccion atraccion1 = crearAtraccion( "Risko", "De 8:00 am a 5:00 pm",
               "Montaña rusa de fuerte impacto y diseño con grandes elevaciones",
               "Adulto", "Alto", "80 Kilos");

       Atraccion atraccion2 = crearAtraccion("Ciclón", "De 8:00 am a 5:00 pm", "Disco en " +
                       "posición horizontal que gira a una velocidad de 300 km/h, mientras se eleva, hasta quedar en" +
                       " posición vertical", "Adolescente y Adulto", "Medio", "80 Kilos" );

       Atraccion atraccion3 = crearAtraccion("Horses", "De 9:00 am a 4:00 pm",
               "Carrusel con caballitos de plástico para montar mientra gira", "Niño",
               "Bajo", "30 Kilos");

       Atraccion atraccion4 = crearAtraccion("Botes", "De 8:00 am a 5:00 pm",
               "Botes acuáticos que realizan un recorrido por un río artificial mientras disfruta " +
                       "la del paisaje", "Niño, Adolescente y Adulto", "Bajo", "80 Kilos");

       Atraccion atraccion5 = crearAtraccion("Carros chocones", "De 9:00 am a 4:00 pm",
               "Carritos chocones impulsados por electricidad", "Adolescente y Adulto",
               "Medio", "75Kilos");

       Atraccion atraccion6 = crearAtraccion("Karts", "De 9:00 am a 5:00 pm",
               "Autos tipo karts impulsados por gasolina que permiten realizar un recorrido por una pista",
               "Adolescente y Adulto", "Medio", "75 Kilos");

       Atraccion atraccion7 = crearAtraccion("Aqua", "De 8:00 am a 4:00 pm",
               "Montaña rusa acuática", "Adolescente y Adulto", "Medio",
               "80 Kilos");

       Atraccion atraccion8 = crearAtraccion("Cumbre", "De 8:00 am a 5:00 pm",
               "Tirolina impulsada por resortes", "Adulto", "Alto", "70 Kilos");

       Atraccion atraccion9 = crearAtraccion ("Tren", "De 9:00 am a 4:00 pm",
               "Tren para los más pequeños que realiza un recorrido por todo el parque temático",
               "Niño", "Bajo", "30 Kilos");

       Atraccion atraccion10 = crearAtraccion ("Tren", "De 9:00 am a 4:00 pm",
                "Tren para los más pequeños que realiza un recorrido por todo el parque temático",
                "Niño", "Bajo", "30 Kilos");

       Visitante visitante1 = crearVisitante("Yamileth", "Londoño Burgos", "37 Años",
                "1.094.881.192", "Adulto", "Femenino", "58 Kilos");

       Visitante visitante2 = crearVisitante("Daniel Esteban", "Quintero Londoño", "15 Años",
                "1061724266", "Adolescente", "Masculino", "50 Kilos");

       Visitante visitante3 = crearVisitante("Emily Tatiana", "Quintero Londoño", "18 Años",
                "1090273121", "Adulto", "Femenino", "62 Kilos");

       Visitante visitante4 = crearVisitante("Maria José","Díaz Castro", "25 Años",
                "1066349826","Adulto", "Femenino", "60 Kilos");

       Visitante visitante5 = crearVisitante("Daniel Esteban","Londoño Burgos", "16 Años",
                "1126408744","Adolescente", "Masculino", "65 Kilos");

       Visitante visitante6 = crearVisitante("Camilo Andrés","Pérez Cardona",
                "6 Años","1145099123","Niño",
                "Masculino", "45 Kilos");

       Visitante visitante7 = crearVisitante("Celeste","Angulo Ruiz",
                "3 Años","1128545309","Niño",
                "Femenino", "25 Kilos");

       Visitante visitante8 = crearVisitante("Lucía","Rios Holguin",
                "14 Años","1045765108","Adolescente",
                "Femenino", "52 Kilos");

       Visitante visitante9 = crearVisitante("Juan David","Soto Tapasco",
                "16 Años","1081345825","Adolescente",
                "Masculino", "64 Kilos");

       Visitante visitante10 = crearVisitante("Fabián","Sánchez Gallego",
                "34 Años","1036891260", "Adulto",
                "Masculino", "78 Kilos");


    }

    private static Atraccion crearAtraccion(String nombre, String horarioOperacion, String descripcion,
                                            String rangoEdad, String nivelPeligro, String pesoMaximo) {
        Atraccion atraccion = new Atraccion(nombre, horarioOperacion, descripcion, rangoEdad, nivelPeligro, pesoMaximo);
        return atraccion;
    }

    private static Visitante crearVisitante(String nombres, String apellidos, String edad, String numeroIdentificacion,
                                            String tipoVisitante, String sexo, String peso) {
        Visitante visitante = new Visitante(nombres, apellidos, edad, numeroIdentificacion, tipoVisitante, sexo, peso);
        return visitante;
    }
}