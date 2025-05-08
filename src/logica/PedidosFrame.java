package logica;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PedidosFrame extends JFrame {
    public PedidosFrame() {
        setTitle("Gestión de Pedidos");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        try (Connection conn = ConexionDB.conectar()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pedidos ORDER BY fecha_pedido DESC");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_cliente");
                String direccion = rs.getString("direccion");
                String fecha = rs.getString("fecha_pedido");
                area.append("Pedido #" + id + " | Cliente: " + nombre + "\nDirección: " + direccion + "\nFecha: " + fecha + "\n\n");
            }
        } catch (Exception ex) {
            area.setText("Error al cargar los pedidos.");
        }

        add(scroll);
        setVisible(true);
    }
}

