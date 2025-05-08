package logica;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class CarritoFrame extends JFrame {
    private DefaultListModel<Pizza> modeloCarrito;
    private Usuario usuario;

    public CarritoFrame(DefaultListModel<Pizza> carrito, Usuario usuario) {
        this.modeloCarrito = carrito;
        this.usuario = usuario;

        setTitle("Carrito de Compras");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JList<Pizza> lista = new JList<>(modeloCarrito);
        JButton btnOrdenar = new JButton("Ordenar");

        btnOrdenar.addActionListener(e -> realizarPedido());

        setLayout(new BorderLayout());
        add(new JScrollPane(lista), BorderLayout.CENTER);
        add(btnOrdenar, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void realizarPedido() {
        String direccion = JOptionPane.showInputDialog("Ingresa tu dirección:");

        try (Connection conn = ConexionDB.conectar()) {
            if (conn == null) return;

            String sqlPedido = "INSERT INTO pedidos (nombre_cliente, direccion) VALUES (?, ?)";
            PreparedStatement stmtPedido = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS);
            stmtPedido.setString(1, usuario.getNombre());
            stmtPedido.setString(2, direccion);
            stmtPedido.executeUpdate();

            ResultSet rs = stmtPedido.getGeneratedKeys();
            if (rs.next()) {
                int pedidoId = rs.getInt(1);
                String sqlDetalle = "INSERT INTO detalle_pedido (pedido_id, tipo_pizza, tamano, cantidad) VALUES (?, ?, ?, ?)";
                PreparedStatement stmtDetalle = conn.prepareStatement(sqlDetalle);

                for (int i = 0; i < modeloCarrito.getSize(); i++) {
                    Pizza pizza = modeloCarrito.getElementAt(i);
                    stmtDetalle.setInt(1, pedidoId);
                    stmtDetalle.setString(2, pizza.getTipo());
                    stmtDetalle.setString(3, pizza.getTamano());
                    stmtDetalle.setInt(4, pizza.getCantidad());
                    stmtDetalle.addBatch();
                }
                stmtDetalle.executeBatch();

                JOptionPane.showMessageDialog(this, "¡Pedido realizado con éxito!");
                modeloCarrito.clear();
                dispose();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar el pedido.");
        }
    }
}
