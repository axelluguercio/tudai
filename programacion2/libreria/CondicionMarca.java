package libreria;

public class CondicionMarca implements Condicion {

    private String marca;

    public CondicionMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(ElementodeCartera el) {
        //retorna la marca
        String marcaRequerida = el.getMarca();
        return marcaRequerida.contains(this.marca);
    }

}
