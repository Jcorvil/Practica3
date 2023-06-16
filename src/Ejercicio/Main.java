package Ejercicio;


//Ejercicio 5
//Clase con método main
public class Main {
    public static void main(String[] args) {
        //Ejercicio 5
        //Se crea un alumno que vive en una casa.
        Direccion direccion = new Direccion("Calle calle", 1, "A", 12345, "Ciudad", "Provincia");

        //Se crea el alumno
        Alumno alumno1 = new Alumno("Joselito", "Martín", "González", 18);
        Alumno alumno2 = new Alumno("Manolita", "Juarez", "Perez", 18);

        alumno1.setNotaMedia(8.5);
        alumno2.setNotaMedia(7.5);

        //Ejercicio 8
        System.out.println(Alumno.calcularNotaMediaMaxima(alumno1, alumno2));;

        alumno1.setDireccion(direccion);

        //Se crea la casa
        Casa casa = new Casa();
        casa.setDireccion(direccion);

        casa.setPrecio(200000);
        casa.setCalifEnergetica('B');
        casa.setRefrCatastral("123456789");

        // Imprimir información de la casa
        /*
        casa.imprimirInfoCasa();

        // Imprimir información del alumno
        System.out.println("Información del alumno:");
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Primer apellido: " + alumno1.getPrimerApellido());
        System.out.println("Segundo apellido: " + alumno1.getSegundoApellido());
        System.out.println("Edad: " + alumno1.getEdad());
        System.out.println("Dirección: " + alumno1.getDireccion().getCalle() + " " +
                alumno1.getDireccion().getNumero() + " " + alumno1.getDireccion().getPoblacion());
                */

    }
}