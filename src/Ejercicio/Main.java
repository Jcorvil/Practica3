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

        System.out.println("Vive en ");
        Alumno2.direccion1.setCalle("Avda. Herrera Oria ");
        Alumno2.direccion1.setNumero(4);
        Alumno2.direccion1.setPuerta("2ºB");
        Alumno2.direccion1.setCodPostal(11600);
        Alumno2.direccion1.setPoblacion("Ubrique");
        Alumno2.direccion1.setProvincia("Cadiz");
        System.out.println(Alumno2.direccion1.getCalle() + " " + Alumno2.direccion1.getNumero() + " " + Alumno2.direccion1.getPuerta() + " " + Alumno2.direccion1.getCodPostal() + " " + Alumno2.direccion1.getPoblacion() + " " + Alumno2.direccion1.getProvincia());

    }
}