package Ejercicio;

public class Alumno{
    protected static String Nombre;
    protected static String Apellido1;
    protected static String Apellido2;
    protected static Integer Edad;
    protected static String Repetidor;
    protected static Float NotaMedia;
    protected static String Email;

    protected Alumno(){}

    float notaMedia(float a,float b){
        float numeroMayor;
        numeroMayor=Math.max(a,b);
        return numeroMayor;
    }

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
