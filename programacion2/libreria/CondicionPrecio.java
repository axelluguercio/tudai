package libreria;

public class CondicionPrecio implements Condicion {

    private double precioRequerido;

    public CondicionPrecio(double precio) {
        this.precioRequerido = precio;
    }


    @Override
    public boolean cumple(ElementodeCartera el) {
        //retorna el precio
        double precioProducto = el.getPrecio();
        return precioProducto >= this.precioRequerido;
    }
}
