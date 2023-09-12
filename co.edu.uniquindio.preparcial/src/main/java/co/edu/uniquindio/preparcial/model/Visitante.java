package co.edu.uniquindio.preparcial.model;

public class Visitante {

    private String nombres;
    private String apellidos;
    private String edad;
    private String numeroIdentificacion;
    private String tipoVisitante;
    private String sexo;
    private String peso;

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

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion +
                "nombres: " + getNombres() + "\n" +
                "apellidos: " + getApellidos() + "\n" +
                "edad: " + getEdad() + "\n" +
                "numeroIdentificacion: " + getNumeroIdentificacion() + "\n" +
                "tipovisitante: " + getTipoVisitante() + "\n" +
                "sexo: " + getSexo() + "\n" +
                "peso: " + getPeso() + "\n";
        return informacion;
    }
}
