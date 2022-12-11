package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Alumno Alumno1 = new Alumno();
        System.out.println(Alumno1.getNombre() + " " + Alumno1.getApellido1() + " " + Alumno1.getApellido2() + " " + Alumno1.getEdad());

        Alumno Alumno2 = new Alumno();
        Alumno2.setNombre("Jorge");
        Alumno2.setApellido1("Coronil");
        Alumno2.setApellido2("Villalba");
        Alumno2.setEdad(25);
        System.out.println(Alumno2.getNombre() + " " + Alumno2.getApellido1() + " " + Alumno2.getApellido2() + " " + Alumno2.getEdad());




        Direccion direccion1 = new Direccion("Avda. Herrera Oria", 4, "2ºB", 11600, "Ubrique", "Cadiz");
        direccion1.direccionCompleta("Avda. Herrera Oria", 4, "2ºB", 11600, "Ubrique", "Cadiz");
        direccion1.direccionCompleta("Avda. Herrera Oria", "Ubrique");


        Alumno2.setNotaMedia(7.0f);
        Alumno Alumno3 = new Alumno();
        Alumno3.setNotaMedia(6.5f);
        float notaMedia = Alumno2.notaMedia(Alumno2.getNotaMedia(), Alumno3.getNotaMedia());
        System.out.println(notaMedia);
    }
}