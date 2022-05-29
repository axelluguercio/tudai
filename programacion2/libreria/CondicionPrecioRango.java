package libreria;

public class CondicionPrecioRango implements Condicion {

    private double precioMin;
    private double precioMax;

    public CondicionPrecioRango(double precio_minimo, double precio_maximo) {
        this.precioMin = precio_minimo;
        this.precioMax = precio_maximo;
    }

    @Override
    public boolean cumple(ElementodeCartera el) {
        // retorna el precio
        double pr = el.getPrecio();
        return (pr > precioMin && pr < precioMax);
    }
}
