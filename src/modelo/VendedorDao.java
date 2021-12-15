package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDao {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion conexion = new Conexion();
    Connection acceso;
    
    // validamos al vendedor usando el dni como contraseña y el usuario
    public Vendedor validar(String dni, String usuario) {
        Vendedor vendedor = new Vendedor(); 
        String sql = "SELECT * FROM vendedor WHERE dni=? AND usuario=?";
        try {
            acceso = conexion.mysql();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, usuario);
            rs = ps.executeQuery();
            while (rs.next()) {                
                vendedor.setIdVendedor(rs.getInt(1));
                vendedor.setDni(rs.getString(2));
                vendedor.setNombre(rs.getString(3));
                vendedor.setTelefono(rs.getString(4));
                vendedor.setEstado(rs.getString(5));
                vendedor.setUsuario(rs.getString(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vendedor;
    }
}
