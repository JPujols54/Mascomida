package logica;

public class Pizza {
    private String tipo;
    private String tamano;
    private int cantidad;

    public Pizza(String tipo, String tamano, int cantidad) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.cantidad = cantidad;
    }

    public String getTipo() { return tipo; }
    public String getTamano() { return tamano; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return cantidad + "x " + tipo + " (" + tamano + ")";
    }
}


