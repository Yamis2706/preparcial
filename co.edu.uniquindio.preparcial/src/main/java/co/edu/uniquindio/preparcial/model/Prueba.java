package co.edu.uniquindio.preparcial.model;

public class Prueba {
    public static void main(String[] args) {

        Atraccion atraccion1 = new Atraccion("Krater", "10 am a 6 pm", "Montaña rusa", "11 a 17 Años", "medio", 500);
        Atraccion atraccion2 = new Atraccion("ciclon", "9 am a 6 pm", "Montaña rusa", "18 Años en adelante", "alto", 1000);
        Atraccion atraccion3 = new Atraccion("carros chocones", "12 am a 6 pm", "juego mecanico", "", "bajo", 250);
        Atraccion atraccion4 = new Atraccion("Ring ring", "8 am a 6 pm", "juego mecanico", 5, "bajo", 1500);
        Visitante visitante1 = new Visitante("Santiago", "Lopez", "15 Años", "2334575823", "Adolescente", "Masculino", 45);
        Visitante visitante2 = new Visitante("valeria", "Ramirez", "6 Años", "1232343423", "niño", "Femenino", 30);
        Visitante visitante3 = new Visitante("Sandra", "Martinez", "30 Años", "4398439283", "Adulto", "Femenino", 70);
        Visitante visitante4 = new Visitante("Gustavo", "Cuellar", "20 Años", "1223986754", "Adulto", "Masculino", 80);

        /*Metodo que verifique a que atraccion se puede subir de acuerdo a la edad */

        String atraccionAptaEdad = obtenerAtraccionAptaEdad(atraccion1.getNombre(), atraccion2.getNombre(),
                atraccion3.getNombre(), atraccion4.getNombre(), visitante2.getEdad());
        System.out.println("De acuerdo a la edad del visitante 2, se puede subir a la atracción: " + atraccionAptaEdad);

        /*Metodo que obtenga el numero de atracciones para niños */

        Integer cantidadAtraccionesninos = obtenerCantidadAtraccionesNinios(atraccion1.getRangoEdad(),
                atraccion2.getRangoEdad(), atraccion3.getRangoEdad(), atraccion4.getRangoEdad());
        System.out.println("La cantidad de atracciones para niños son: " + cantidadAtraccionesninos);

        /Metodo para obtener la informacion de la primera atracción/

                String informacionAtraccion1 = obtenerInformacionAtraccion1(atraccion1.getNombre(),
            atraccion1.getHorario(), atraccion1.getDescripcion(), atraccion1.getRangoEdad(),
            atraccion1.getNivelPeligro(), atraccion1.getPesoMaximo());
        System.out.println("Informacion de la atraccion 1: " + informacionAtraccion1);


        /Metodo para obtener la informacion de la segunda atracción/

                String informacionAtraccion2 = obtenerInformacionAtraccion2(atraccion2.getNombre(), atraccion2.getHorario(), atraccion2.getDescripcion(), atraccion2.getRangoEdad(), atraccion2.getNivelPeligro(), atraccion2.getPesoMaximo());
        System.out.println("Informacion de la atraccion 2: " + informacionAtraccion2);

        /Metodo para obtener la informacion de la tercera atracción/

                String informacionAtraccion3 = obtenerInformacionAtraccion3(atraccion3.getNombre(), atraccion3.getHorario(), atraccion3.getDescripcion(), atraccion3.getRangoEdad(), atraccion3.getNivelPeligro(), atraccion3.getPesoMaximo());
        System.out.println("Informacion de la atraccion 3: " + informacionAtraccion3);

        /Metodo para obtener la informacion de la cuarta atracción/

                String informacionAtraccion4 = obtenerInformacionAtraccion4(atraccion4.getNombre(), atraccion4.getHorario(), atraccion4.getDescripcion(), atraccion4.getRangoEdad(), atraccion4.getNivelPeligro(), atraccion4.getPesoMaximo());
        System.out.println("Informacion de la atraccion 4: " + informacionAtraccion4);

        /Metodo que obtenga el visitane con mayor edad y que sea adulto/

        String visitanteMayorEdad = obtenerVisitanteMayorEdad(visitante1.getEdad(), visitante2.getEdad(), visitante3.getEdad(), visitante4.getEdad());
        System.out.println("El visitante con mayor edad y que es adulto es: " + visitanteMayorEdad);

        /Metodo que obtenga el visitante con mayor edad y que sea adolescente/

        int esAdolescente1 = verificarSiVisitanteEsAdolescente(visitante1.getEdad());
        int esAdolescente2 = verificarSiVisitanteEsAdolescente(visitante2.getEdad());
        int esAdolescente3 = verificarSiVisitanteEsAdolescente(visitante3.getEdad());
        int esAdolescente4 = verificarSiVisitanteEsAdolescente(visitante4.getEdad());
        String visitanteMayorAdolescente = obtenerVisitanteMayorAdolescente(esAdolescente1, esAdolescente2, esAdolescente3, esAdolescente4);
        System.out.println("El visitante con mayor edad y que es adolescente es: " + visitanteMayorAdolescente);
    }

    private static String obtenerAtraccionAptaEdad(String atraccion1, String atraccion2, String atraccion3, String atraccion4, Integer edad) {

        String atraccion = "";

        if (edad >= 5 && edad <= 6) {
            atraccion = atraccion4;
        } else if (edad >= 7 && edad < 14) {
            atraccion = atraccion4 + atraccion3;
        } else if (edad >= 14 && edad < 16) {
            atraccion = atraccion4 + atraccion3 + atraccion1;
        } else
            atraccion = atraccion4 + atraccion3 + atraccion1 + atraccion2;
        return atraccion;

    }

    private static Integer obtenerCantidadAtraccionesNinios(Integer atraccion1, Integer atraccion2, Integer atraccion3, Integer atraccion4) {
        int contadorAtraccionNinos = 0;

        if (atraccion1 <= 10) {
            contadorAtraccionNinos = contadorAtraccionNinos + 1;
        }
        if (atraccion2 <= 10) {
            contadorAtraccionNinos = contadorAtraccionNinos + 1;
        }
        if (atraccion3 <= 10) {
            contadorAtraccionNinos = contadorAtraccionNinos + 1;
        }
        if (atraccion4 <= 10) {
            contadorAtraccionNinos = contadorAtraccionNinos + 1;
        } else
            contadorAtraccionNinos = contadorAtraccionNinos;
        return contadorAtraccionNinos;
    }

    private static String obtenerInformacionAtraccion1(String nombre, String horario, String descripcion, Integer rangoEdad, String nivelPeligro, Integer pesoMaximo) {
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario: " + horario + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango de edad: " + rangoEdad + "\n" +
                "nivel de peligro: " + nivelPeligro + "\n" +
                "peso maximo: " + pesoMaximo + "\n";
        return informacion;
    }

    private static String obtenerInformacionAtraccion2(String nombre, String horario, String descripcion, Integer rangoEdad, String nivelPeligro, Integer pesoMaximo) {
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario: " + horario + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango de edad: " + rangoEdad + "\n" +
                "nivel de peligro: " + nivelPeligro + "\n" +
                "peso maximo: " + pesoMaximo + "\n";
        return informacion;
    }

    private static String obtenerInformacionAtraccion3(String nombre, String horario, String descripcion, Integer rangoEdad, String nivelPeligro, Integer pesoMaximo) {
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario: " + horario + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango de edad: " + rangoEdad + "\n" +
                "nivel de peligro: " + nivelPeligro + "\n" +
                "peso maximo: " + pesoMaximo + "\n";
        return informacion;
    }

    private static String obtenerInformacionAtraccion4(String nombre, String horario, String descripcion, Integer rangoEdad, String nivelPeligro, Integer pesoMaximo) {
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario: " + horario + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango de edad: " + rangoEdad + "\n" +
                "nivel de peligro: " + nivelPeligro + "\n" +
                "peso maximo: " + pesoMaximo + "\n";
        return informacion;
    }

    private static String obtenerVisitanteMayorEdad(Integer edadVisitante1, Integer edadVisitante2, Integer edadVisitante3, Integer edadVisitante4) {
        String visitanteMayorEdad = "";

        if (edadVisitante1 > edadVisitante2 && edadVisitante1 > edadVisitante3 && edadVisitante1 > edadVisitante4) {
            visitanteMayorEdad = "Santiago";
        } else if (edadVisitante2 > edadVisitante1 && edadVisitante2 > edadVisitante3 && edadVisitante2 > edadVisitante4) {
            visitanteMayorEdad = "Valeria";
        } else if (edadVisitante3 > edadVisitante1 && edadVisitante3 > edadVisitante2 && edadVisitante3 > edadVisitante4) {
            visitanteMayorEdad = "Sandra";
        } else
            visitanteMayorEdad = "Gustavo";
        return visitanteMayorEdad;
    }

    private static int verificarSiVisitanteEsAdolescente(int edad){
        int edadAdolescente = 0;

        if (edad >= 15 && edad <= 17){
            edadAdolescente = edad;
        }

        return edadAdolescente;
    }

    private static String obtenerVisitanteMayorAdolescente(int edadVisitante1,int edadVisitante2,int edadVisitante3,int edadVisitante4) {
        String mayorAdolescente = "";
        if (edadVisitante1 > edadVisitante2 && edadVisitante1 > edadVisitante3 && edadVisitante1 > edadVisitante4) {
            mayorAdolescente = "Santiago";
        } else if (edadVisitante2 > edadVisitante1 && edadVisitante2 > edadVisitante3 && edadVisitante2 > edadVisitante4) {
            mayorAdolescente = "Valeria";
        } else if (edadVisitante3 > edadVisitante1 && edadVisitante3 > edadVisitante2 && edadVisitante3 > edadVisitante4) {
            mayorAdolescente = "Sandra";
        } else
            mayorAdolescente = "Gustavo";

        return mayorAdolescente;
    }
}
