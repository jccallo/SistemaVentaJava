package modelo;

public class Vendedor {
    private int idVendedor;
    private String dni;
    private String nombre;
    private String telefono;
    private String estado;
    private String usuario;

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String dni, String nombre, String telefono, String estado, String usuario) {
        this.idVendedor = idVendedor;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
