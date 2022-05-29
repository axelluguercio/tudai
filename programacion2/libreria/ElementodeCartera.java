package libreria;

public abstract class ElementodeCartera {

    private String nombre;
    protected String marca;
    protected double precio;
    protected double volumen;

    public ElementodeCartera(String nombre, String marca, double precio, double volumen) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }

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

}
