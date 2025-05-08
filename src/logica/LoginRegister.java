package logica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginRegister extends JFrame {
    public LoginRegister() {
        setTitle("Login / Registro");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        // Panel login
        JPanel loginPanel = new JPanel(new GridLayout(4, 1));
        JTextField userLogin = new JTextField();
        JPasswordField passLogin = new JPasswordField();
        JButton btnLogin = new JButton("Iniciar Sesión");
        loginPanel.add(new JLabel("Usuario:"));
        loginPanel.add(userLogin);
        loginPanel.add(new JLabel("Contraseña:"));
        loginPanel.add(passLogin);
        loginPanel.add(btnLogin);

        // Panel registro
        JPanel regPanel = new JPanel(new GridLayout(6, 1));
        JTextField userReg = new JTextField();
        JPasswordField passReg = new JPasswordField();
        JComboBox<String> rolBox = new JComboBox<>(new String[]{"usuario", "trabajador"});
        JButton btnRegister = new JButton("Registrarse");
        regPanel.add(new JLabel("Usuario:"));
        regPanel.add(userReg);
        regPanel.add(new JLabel("Contraseña:"));
        regPanel.add(passReg);
        regPanel.add(new JLabel("Rol:"));
        regPanel.add(rolBox);
        regPanel.add(btnRegister);

        tabs.add("Login", loginPanel);
        tabs.add("Registro", regPanel);
        add(tabs);

        btnRegister.addActionListener(e -> {
            try (Connection conn = ConexionDB.conectar()) {
                String sql = "INSERT INTO usuarios (nombre_usuario, contrasena, rol) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, userReg.getText());
                stmt.setString(2, new String(passReg.getPassword()));
                stmt.setString(3, (String) rolBox.getSelectedItem());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registrado correctamente");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar: " + ex.getMessage());
            }
        });

        btnLogin.addActionListener(e -> {
            try (Connection conn = ConexionDB.conectar()) {
                String sql = "SELECT * FROM usuarios WHERE nombre_usuario=? AND contrasena=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, userLogin.getText());
                stmt.setString(2, new String(passLogin.getPassword()));
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    String rol = rs.getString("rol");
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre_usuario");
                    Usuario usuario = new Usuario(id, nombre, rol);
                    if (rol.equals("usuario")) {
                        new MenuPizzaFrame(usuario);
                    } else {
                        new PedidosFrame();
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}

