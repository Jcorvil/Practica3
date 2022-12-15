package Ejercicio;


//Ejercicio 4
//Campos.
public class Direccion {
    protected String Calle;
    protected Integer Numero;
    protected String Puerta;
    protected Integer CodPostal;
    protected String Poblacion;
    protected String Provincia;

    //Ejercicio 6
    //Constructor por defecto
    protected Direccion(){}

    Direccion(String calle, Integer numero, String puerta, Integer CodPostal, String Poblacion, String Provincia){
        this.Calle = calle;
        this.Numero = numero;
        this.Puerta = puerta;
        this.CodPostal = CodPostal;
        this.Poblacion = Poblacion;
        this.Provincia = Provincia;
    }

    Direccion(String calle, String Poblacion){
        this.Calle = calle;
        this.Poblacion = Poblacion;
    }

    //Ejercicio 6
    //Método que imprima dirección completa.
    public void direccionCompleta(String calle, Integer numero, String puerta, Integer CodPostal, String Poblacion, String Provincia){
        System.out.println("Vive en " + getCalle() + " " + getNumero() + " " + getPuerta() + " " + getCodPostal() + " " + getPoblacion() + " " + getProvincia());
    }
    //Ejercicio 6
    //Sobrecarga de método, solo imprime calle y localidad.
    public void direccionCompleta(String calle, String Poblacion){
        System.out.println("Vive en " + getCalle() + " " + getPoblacion());
    }



    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getPuerta() {
        return Puerta;
    }

    public void setPuerta(String puerta) {
        Puerta = puerta;
    }

    public Integer getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(Integer codPostal) {
        CodPostal = codPostal;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
}