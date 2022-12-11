package Ejercicio;

public class Casa {
    protected Integer precio;
    protected Character califEnergetica;
    protected String refrCatastral;
    protected static Integer IVA=21;
    protected static Integer IVAReducido=16;
    protected Direccion direccion2;

    Integer precioIVA(Integer precio){
        Integer total1;
        total1=(precio * IVA/100)+precio;
        return total1;
    }

    Integer precioIvaRedux(Integer precio){
        Integer total2;
        total2=(precio * IVAReducido/100)+precio;
        return total2;
    }

    void totalCasa(String refrCatastral, Integer precio){
        System.out.println(this.refrCatastral);
        System.out.println(this.precio);
        System.out.println(this.precioIVA(this.precio));
        System.out.println(this.precioIvaRedux(this.precio));
    }
}