package Rental_GUI;

public class Vehiculo {
    private String patente;
    private char condicion;

    public Vehiculo(String patente, char condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public char getCondicion() {
        return condicion;
    }
    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
