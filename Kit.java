package libreria;

import java.util.ArrayList;

public class Kit extends ElementodeCartera {

    private ArrayList<ElementodeCartera> paquetes;

    public Kit(String nombre) {
        super(nombre);
        this.paquetes = new ArrayList();
    }


    @Override
    public String getMarca() {
        if (this.paquetes.size() == 0)
            return "";
        return this.paquetes.get(0).getMarca();
    }

    @Override
    public double getVolumen() {
        // si no almaceno para guardar el mayor
        double max = 0.0;
        for (ElementodeCartera el : paquetes) {
            double vol_current = el.getVolumen();
            if (max < vol_current)
                max = vol_current;
        }
        return max;
    }

    @Override
    public double getPrecio() {
        // si no empieza a sumar el precio de los elementos
        double sumadePrecio = 0.0;
        for (ElementodeCartera el : paquetes) {
            sumadePrecio += el.getPrecio();
        }
        return sumadePrecio;
    }

    @Override
    public int getCant() {
        if (paquetes.size() == 0)
            return 0;
        // si no empieza a contar la cantidad de elementos
        int cant = 0;
        for (ElementodeCartera el : paquetes) {
           cant += el.getCant();
        }
        return cant;
    }

    public void addPaquete(ElementodeCartera el) {
        this.paquetes.add(el);
    }

    public boolean removeProducto(ElementodeCartera el) {
        return this.paquetes.remove(el);
    }

    /*/
    No requerido y viola el principio de Encapsulamiento

    public ArrayList<ElementodeCartera> getPaquetes() {
        ArrayList<ElementodeCartera> aux = this.paquetes;
        return aux;
    }
     */

    @Override
    public ArrayList<ElementodeCartera> buscar(Condicion c) {
        ArrayList<ElementodeCartera> listaEncontrada = new ArrayList();
        for (ElementodeCartera el : this.paquetes) {
            if (c.cumple(el))
                listaEncontrada.add(el);
        }
        return listaEncontrada;
    }
}
