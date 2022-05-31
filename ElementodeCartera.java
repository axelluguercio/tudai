package libreria;

import java.util.ArrayList;

public abstract class ElementodeCartera {

    private String nombre;

    public ElementodeCartera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract String getMarca();
    public abstract double getVolumen();
    public abstract double getPrecio();
    public abstract int getCant();

    public abstract ArrayList<ElementodeCartera> buscar(Condicion c);
}
