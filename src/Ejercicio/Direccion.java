package Ejercicio;

public class Direccion {
    protected String Calle;
    protected Integer Numero;
    protected String Puerta;
    protected Integer CodPostal;
    protected String Poblacion;
    protected String Provincia;

    //Getters & Setters
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