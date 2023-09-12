package co.edu.uniquindio.preparcial.ejercicio1;

import co.edu.uniquindio.preparcial.model.Curso;
import co.edu.uniquindio.preparcial.model.Docente;
import co.edu.uniquindio.preparcial.model.Estudiante;

public class MainEjercicio1{
    public static void main(String[] args) {
        Curso curso = inicializaDatosPrueba();
        curso.mostrarInformacionEstudiantes();
        curso.obtenerPromedioCurso();
    }

    public static Curso inicializaDatosPrueba() {
        Estudiante estudiante1 = new Estudiante("Juan",20,"12121@",1,2.0,3.0,5.0);
        Estudiante estudiante2 = new Estudiante("Pedro",30,"12121@",3,3.0,4.0,5.0);
        Estudiante estudiante3 = new Estudiante("Ana",19,"12121@",4,50,3.0,2.0);
        Docente docente = new Docente("Carlos", 30, "sdsd@");
        Curso curso = new Curso("Programacion1",2,"2N",3,"Nocturna", estudiante1, estudiante2, estudiante3,docente);
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);

        return curso;
    }


    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);
        return estudiante;
    }
}