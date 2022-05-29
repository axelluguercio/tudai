package libreria;

public class Producto extends ElementodeCartera {

    public Producto(String nombre, String marca, double precio, double volumen) {
        super(nombre, marca, precio, volumen);
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
}
