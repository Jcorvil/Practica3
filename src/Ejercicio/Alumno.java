package Ejercicio;

//Ejercicio 7
//Importación del paquete "Persona".


import Persona.Persona;

//Ejercicio 2
//Campos
public class Alumno extends Persona {

    //Ejercicio 7
    //Los campos Nombre, apellidos y edad no hacen falta ahora, ya que se heredan de la clase "Persona"
    //private static String nombre;
    //private static String apellidos;
    //private static int edad;
    private static String repetidor;
    private double notaMedia;
    private static String email;
    private static Direccion direccion;


    //Ejercicio 2
    //Constructor sin parámetros
    /*Ejercicio 3. Se añade una restricción al eliminar este constructor y obligar a usar el otro.
    * protected Alumno(){}
    */

    //Constructor con nombre, apellidos y edad

    //Ejercicio 7
    //Este constructor, además de los getetrs y setters, se herdan también de Persona
//    public Alumno(String nombre, String apellidos, int edad) {
//        this.nombre = nombre;
//        this.apellidos = apellidos;
//        this.edad = edad;
//    }

    //Al heredar de la clase Persona, se debe llamar a los campos de esta forma
    public Alumno(String nombre, String primerApellido, String segundoApellido, int edad) {
        super(nombre, primerApellido, segundoApellido, edad);
    }


    //Ejercicio 8

    public static double calcularNotaMediaMaxima(Alumno alumno1, Alumno alumno2) {
        double notaMediaMaxima = Math.max(alumno1.getNotaMedia(), alumno2.getNotaMedia());
        return notaMediaMaxima;
    }

    //Ejercicio 4
    //Getters & setters de Dirección
    //Asociación opcional, ya que puede o no tener una dirección

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Ejercicio 2
    //Getters & Setters


    /*
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Alumno.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        Alumno.apellidos = apellidos;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Alumno.edad = edad;
    }
    */

    public static String getRepetidor() {
        return repetidor;
    }

    public static void setRepetidor(String repetidor) {
        Alumno.repetidor = repetidor;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Alumno.email = email;
    }
}
