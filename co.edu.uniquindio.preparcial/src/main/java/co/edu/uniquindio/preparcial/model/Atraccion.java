package co.edu.uniquindio.preparcial.model;

public class Atraccion {
    private String nombre;
    private String horarioOperacion;
    private String descripcion;
    private String rangoEdad;
    private String nivelPeligro;
    private String pesoMaximo;
    private Atraccion atraccion1;
    private Atraccion atraccion2;
    private Atraccion atraccion3;
    private Atraccion atraccion4;
    private Atraccion atraccion5;
    private Atraccion atraccion6;
    private Atraccion atraccion7;
    private Atraccion atraccion8;
    private Atraccion atraccion9;
    private Atraccion atraccion10;

    public Atraccion(String nombre, String horarioOperacion, String descripcion,
                     String rangoEdad, String nivelPeligro, String pesoMaximo) {
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

    public String getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(String pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Atraccion getAtraccion1() {
        return atraccion1;
    }

    public Atraccion getAtraccion2() {
        return atraccion2;
    }

    public Atraccion getAtraccion3() {
        return atraccion3;
    }

    public Atraccion getAtraccion4() {
        return atraccion4;
    }

    public Atraccion getAtraccion5() {
        return atraccion5;
    }

    public Atraccion getAtraccion6() {
        return atraccion6;
    }
    public Atraccion getAtraccion7() {
        return atraccion7;
    }

    public Atraccion getAtraccion8() {
        return atraccion8;
    }

    public Atraccion getAtraccion9() {
        return atraccion9;
    }
    public Atraccion getAtraccion10() {
        return atraccion10;
    }

    public String obtenerInformacionAtraccion() {
        String informacionAtraccion = "";
        informacionAtraccion = informacionAtraccion +
                "nombre: " + getNombre() + "\n" +
                "horarioOperacion: " + getHorarioOperacion() + "\n" +
                "descripcion: " + getDescripcion() + "\n" +
                "rangoedad: " + getRangoEdad() + "\n" +
                "nivelPeligro: " + getNivelPeligro() + "\n" +
                "pesoMaximo: " + getPesoMaximo() + "\n";
        return informacionAtraccion;
    }
}