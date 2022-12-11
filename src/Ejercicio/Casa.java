package Ejercicio;

public class Casa {
    private Integer precio;
    private Character califEnergetica;
    private String refrCatastral;
    private static Integer IVA=21;
    private static Integer IVAReducido=16;
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