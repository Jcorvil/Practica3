package Ejercicio;

//Ejercicio 1
//Campos
public class Casa extends Direccion{
    private Integer precio;
    private char califEnergetica;
    private String refrCatastral;
    private static Integer iva = 21;
    private static Integer IVAReducido = 16;

    //Relación de composición
    private Direccion direccion;



    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //Ejercicio 1
    //Calculo del precio con iva
    void calculoPrecioIVA(double iva) {
        System.out.println(precio + precio * iva/100);
    }

    //Ejercicio 1
    //Calculo del precio con iva reducido
    void calculoPrecioIVAReducido() {
        System.out.println((precio + precio * IVAReducido/100));
    }

    //Ejercicio 1
    //Imprimir ref. catastral, precio sin IVA y ambos tipos de IVA.
    void imprimirInfoCasa() {
        System.out.println("Referencia catastral: " + refrCatastral);
        System.out.println("Precio sin IVA: " + precio);
        System.out.println("Precio con IVA: " + (precio + precio*iva/100));
        System.out.println("Precio con IVA reducido: " + (precio + precio * IVAReducido/100));
    }


    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public char getCalifEnergetica() {
        return califEnergetica;
    }

    public void setCalifEnergetica(char califEnergetica) {
        this.califEnergetica = califEnergetica;
    }

    public String getRefrCatastral() {
        return refrCatastral;
    }

    public void setRefrCatastral(String refrCatastral) {
        this.refrCatastral = refrCatastral;
    }

    public static Integer getIva() {
        return iva;
    }

    public static void setIva(Integer iva) {
        Casa.iva = iva;
    }

    public static Integer getIVAReducido() {
        return IVAReducido;
    }

    public static void setIVAReducido(Integer IVAReducido) {
        Casa.IVAReducido = IVAReducido;
    }
}