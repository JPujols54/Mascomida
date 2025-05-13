package logica;

import datos.vUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class fUsuarios {
    private ConexionDB mysql = new ConexionDB();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public boolean register(vUsuario dts){
     sSQL = "INSERT INTO usuarios (nombre_usuario, contrasena, rol) VALUES (?, ?, ?)";
     
     try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre_usuario());
            pst.setString(2, dts.getContrasena());
            pst.setString(3, "usuario"); // Rol fijo al registrar

            int n = pst.executeUpdate();
            return n != 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
            return false;
        }
}
    
    public String login(String usuario, String password) {
        sSQL = "SELECT rol FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, usuario);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getString("rol"); // Devuelve el rol si existe el usuario
            } else {
                return null; // No coincide
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
            return null;
        }
    }
    
    
}
