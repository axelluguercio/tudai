package libreria;

public class CondicionNOT implements Condicion {

    private Condicion cc;

    public CondicionNOT(Condicion c1) {
        this.cc = c1;
    }

    @Override
    public boolean cumple(ElementodeCartera el) {
        return !this.cc.cumple(el);
    }
}
