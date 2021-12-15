package modelo;

import java.util.List;

public interface Crud {
    public abstract List listar();
    public abstract int agregar(Object objeto);
    public abstract int actualizar(Object objeto);
    public abstract void actualizar(int id);
}
