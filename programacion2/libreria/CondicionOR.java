package libreria;

public class CondicionOR implements Condicion {

    private Condicion c1;
    private Condicion c2;

    public CondicionOR(Condicion cc1, Condicion cc2) {
        this.c1 = cc1;
        this.c2 = cc2;
    }

    @Override
    public boolean cumple(ElementodeCartera el) {
        return this.c1.cumple(el) || this.c2.cumple(el);
    }
}
