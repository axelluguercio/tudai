package libreria;

import java.util.ArrayList;

public class Libreria {

    private String nombre;
    private ArrayList<ElementodeCartera> productos;
    private Condicion politica;

    public Libreria(String nombre) {
        this.productos = new ArrayList<ElementodeCartera>();
    }

    public void setPolitica(Condicion c) {
        this.politica = c;
    }

    public boolean sePuedePublicar(ElementodeCartera el) {
        return this.politica.cumple(el);
    }

    public ArrayList<ElementodeCartera> buscarProductos(Condicion c) {
        ArrayList<ElementodeCartera> listaEncontrada = new ArrayList();
        for (ElementodeCartera el : productos) {
            if (c.cumple(el))
                listaEncontrada.add(el);
        }
        return listaEncontrada;
    }
}
