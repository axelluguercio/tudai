package libreria;

import java.util.ArrayList;

public class Producto extends ElementodeCartera {

    private String marca;
    private double precio;
    private double volumen;

    public Producto(String nombre, String marca, double precio, double volumen) {
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public int getCant() {
        return 1;
    }

    @Override
    public ArrayList<ElementodeCartera> buscar(Condicion c) {
        ArrayList<ElementodeCartera> listaEncontrado = new ArrayList();
        if (c.cumple(this))
            listaEncontrado.add(this);
        return listaEncontrado;
    }

    // redefined equals method from object for remove an element from arraylists.
    @Override
    public boolean equals (Object el_to_sacar) {
        if (this == el_to_sacar)
            return true;
        if (el_to_sacar == null)
            return false;
        if (this.getClass() != el_to_sacar.getClass())
            return false;
        Producto el_comparar = (Producto) el_to_sacar;
        if (this.getNombre() != el_comparar.getNombre())
            return false;
        return true;
    }
}
