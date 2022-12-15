package Ejercicio;

//Ejercicio 1
//Campos
public class Casa extends Direccion{
    protected Integer precio;
    protected Character califEnergetica;
    protected String refrCatastral;
    protected static Integer IVA=21;
    protected static Integer IVAReducido=16;

    //Ejercicio 4
    //Otorgar dirección a la clase del ejercicio 1
    Direccion direccionCasa = new Direccion("Calle España", 4, "2ºB", 11600, "Ubrique", "Cadiz"){};

    //Ejercicio 1
    //Calculo del precio con iva
    Integer precioIVA(Integer precio){
        Integer total1;
        total1=(precio * IVA/100)+precio;
        return total1;
    }
    //Ejercicio 1
    //Calculo del precio con iva reducido
    Integer precioIvaReducido(Integer precio){
        Integer total2;
        total2=(precio * IVAReducido/100)+precio;
        return total2;
    }

    //Ejercicio 1
    //Imprimir ref. catastral, precio sin IVA y ambos tipos de IVA.
    protected void totalCasa(String refrCatastral, Integer precio){
        System.out.println(this.refrCatastral);
        System.out.println(this.precio);
        System.out.println(this.precioIVA(this.precio));
        System.out.println(this.precioIvaReducido(this.precio));
    }
}