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
        return paquetes.get(0).getMarca();
    }

    @Override
    public double getVolumen() {
        if (paquetes.size() == 0)
            return 0.0;
        // si no almaceno para guardar el mayor
        double max = -999.0;
        for (ElementodeCartera el : paquetes) {
            if (max < el.getVolumen())
                max = el.getVolumen();
        }
        return max;
    }

    @Override
    public double getPrecio() {
        if (paquetes.size() == 0)
            return 0.0;
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

    public boolean removePaquete(ElementodeCartera el) {
        return this.paquetes.remove(el);
    }

    public ArrayList<ElementodeCartera> getPaquetes() {
        ArrayList<ElementodeCartera> aux = this.paquetes;
        return aux;
    }
}
