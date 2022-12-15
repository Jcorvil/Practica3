package Ejercicio;


//Ejercicio 5
//Clase con método main
public class Main {
    public static void main(String[] args) {

        //Ejercicio 5
        //Se crea un alumno que vive en una casa.
        Alumno alumno2 = new Alumno("Jorge", "Coronil", "Villalba", 25);

        alumno2.identificador();

        Direccion direccion1 = new Direccion("Calle España", 4, "2ºB", 11600, "Ubrique", "Cadiz");
        System.out.println("El alumno " + alumno2.getNombre() + " " + alumno2.getApellido1() + " " + alumno2.getApellido2() + " vive en " + direccion1.getCalle() + " " + direccion1.getNumero() + " " + direccion1.getPuerta() + " " + direccion1.getCodPostal() + " " + direccion1.getPoblacion() + " " + direccion1.getProvincia());

        alumno2.setNotaMedia(7.0f);
        Alumno alumno3 = new Alumno("Rubén", "Viruez", "Flores", 22);
        alumno3.setNotaMedia(6.5f);

    }
}