package Ejercicio;

//Ejercicio 7
//Importación del paquete "Persona".
import org.losremedios.daw1.prog.practica.UT3.Persona.Persona;


//Ejercicio 2
//Campos
public class Alumno{
    protected static String Nombre;
    protected static String Apellido1;
    protected static String Apellido2;
    protected static Integer Edad;
    protected static String Repetidor;
    protected static Float NotaMedia;
    protected static String Email;


    //Ejercicio 2
    //Constructor sin parámetros
    /*Ejercicio 3. Se añade una restricción al eliminar este constructor y obligar a usar el otro.
    * protected Alumno(){}
    */

    //Constructor con nombre, apellidos y edad
    protected Alumno(String Nombre, String Apellido1, String Apellido2, Integer Edad){
    }

    void identificador(){
        System.out.println(Nombre + " " + Apellido1 + " " + Apellido2 + ", " + Edad + " años.");
    }

    static void notaMedia(float a,float b){
        float numeroMayor;
        numeroMayor=Math.max(a,b);
    }


    //Ejercicio 2
    //Getters & Setters
    public  String getNombre() {
        return Nombre;
    }

    public  void setNombre(String nombre) {
        Nombre = nombre;
    }

    public  String getApellido1() {
        return Apellido1;
    }

    public  void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public  String getApellido2() {
        return Apellido2;
    }

    public  void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public  Integer getEdad() {
        return Edad;
    }

    public  void setEdad(Integer edad) {
        Edad = edad;
    }

    public  String getRepetidor() {
        return Repetidor;
    }

    public  void setRepetidor(String repetidor) {
        Repetidor = repetidor;
    }

    public  Float getNotaMedia() {
        return NotaMedia;
    }

    public  void setNotaMedia(Float notaMedia) {
        NotaMedia = notaMedia;
    }

    public  String getEmail() {
        return Email;
    }

    public  void setEmail(String email) {
        Email = email;
    }
}
