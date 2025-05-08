package datos;

import java.sql.Timestamp;

public class vPedidos {
    private int id;
    private String nombre_cliente;
    private String direccion;
    private Timestamp fecha_pedido;

    public vPedidos() {
    }

    public vPedidos(int id, String nombre_cliente, String direccion, Timestamp fecha_pedido) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.direccion = direccion;
        this.fecha_pedido = fecha_pedido;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Timestamp getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Timestamp fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}
