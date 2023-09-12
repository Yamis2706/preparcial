package co.edu.uniquindio.preparcial.model;

public class Visitante {
    private String nombres;
    private String apellidos;
    private String edad;
    private String numeroIdentificacion;
    private String tipoVisitante;
    private String sexo;
    private String peso;
    private Visitante visitante1;
    private Visitante visitante2;
    private Visitante visitante3;
    private Visitante visitante4;
    private Visitante visitante5;
    private Visitante visitante6;
    private Visitante visitante7;
    private Visitante visitante8;
    private Visitante visitante9;
    private Visitante visitante10;

    public Visitante(String nombres, String apellidos, String edad, String numeroIdentificacion,
                     String tipoVisitante, String sexo, String peso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoVisitante = tipoVisitante;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Visitante getVisitante1() {
        return visitante1;
    }

    public Visitante getVisitante2() {
        return visitante2;
    }
    public Visitante getVisitante3() {
        return visitante3;
    }
    public Visitante getVisitante4() {
        return visitante4;
    }

    public Visitante getVisitante5() {
        return visitante5;
    }

    public Visitante getVisitante6() {
        return visitante6;
    }

    public Visitante getVisitante7() {
        return visitante7;
    }
    public Visitante getVisitante8() {
        return visitante8;
    }

    public Visitante getVisitante9() {
        return visitante9;
    }

    public Visitante getVisitante10() {
        return visitante10;
    }

    public String obtenerInformacionVisitante() {
        String informacionVisitante = "";
        informacionVisitante = informacionVisitante +
                "nombres: " + getNombres() + "\n" +
                "apellidos: " + getApellidos() + "\n" +
                "edad: " + getEdad() + "\n" +
                "numeroIdentificacion: " + getNumeroIdentificacion() + "\n" +
                "tipovisitante: " + getTipoVisitante() + "\n" +
                "sexo: " + getSexo() + "\n" +
                "peso: " + getPeso() + "\n";
        return informacionVisitante;
    }
}