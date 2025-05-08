package datos;


public class vDetallePedido {
    private int id;
    private int pedido_id;
    private String tipo_pizza;
    private String tamano;
    private int cantidad;
    private Double precio_unitario;

    public vDetallePedido() {
    }

    public vDetallePedido(int id, int pedido_id, String tipo_pizza, String tamano, int cantidad, Double precio_unitario) {
        this.id = id;
        this.pedido_id = pedido_id;
        this.tipo_pizza = tipo_pizza;
        this.tamano = tamano;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public String getTipo_pizza() {
        return tipo_pizza;
    }

    public void setTipo_pizza(String tipo_pizza) {
        this.tipo_pizza = tipo_pizza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

