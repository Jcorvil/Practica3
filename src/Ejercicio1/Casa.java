package Ejercicio1;

public class Casa {
    static Integer IVACompleto = 21;
    static Integer IVAReducido = 16;

    public static void main (String[]args){
        Integer Precio = 150000;
        Character CalificacionEnergetica = 'A';
        String ReferenciaCatastral = "1234567 AB1234A 0000 AB";

        double CalculoPrecioIVA = Precio * 1.21;
        double CalculoPrecioIVAReducido = Precio * 1.16;

        System.out.println("Referencia castastral: " + ReferenciaCatastral);
        System.out.println("Precio sin IVA: " + Precio);
        System.out.println("Precio con 21% de IVA: " + CalculoPrecioIVA);
        System.out.println("Precio con 16% de IVA: " + CalculoPrecioIVAReducido);
    }
}