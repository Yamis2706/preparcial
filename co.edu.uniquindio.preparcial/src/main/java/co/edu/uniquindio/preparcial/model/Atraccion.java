package co.edu.uniquindio.preparcial.model;

public class Atraccion {

      private String nombre;
      private String horarioOperacion;
      private String descripcion;
      private String rangoEdad;
      private String nivelPeligro;
      private int pesoMaximo;

    public Atraccion(String nombre, String horarioOperacion, String descripcion,
                     Strig rangoEdad, String nivelPeligro, int pesoMaximo) {
        this.nombre = nombre;
        this.horarioOperacion = horarioOperacion;
        this.descripcion = descripcion;
        this.rangoEdad = rangoEdad;
        this.nivelPeligro = nivelPeligro;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorarioOperacion() {
        return horarioOperacion;
    }

    public void setHorarioOperacion(String horarioOperacion) {
        this.horarioOperacion = horarioOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion +
                "nombre: " + getNombre() + "\n" +
                "horarioOperacion: " + getHorarioOperacion() + "\n" +
                "descripcion: " + getDescripcion() + "\n" +
                "rangoedad: " + getRangoEdad() + "\n" +
                "nivelPeligro: " + getNivelPeligro() + "\n" +
                "pesoMaximo: " + getPesoMaximo() + "\n";
        return informacion;
    }


    public String subirAtraccion (int rangoEdad){

        if (rangoEdad >= 3 && rangoEdad <= 10)
            if (nivelPeligro = "Bajo");{
            return "Puede subir a la atracción;
        }else {
            "No puede subir a la atracción";
        }




}