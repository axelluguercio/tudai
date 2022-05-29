package libreria;

public class Main {

    public static void main(String[] args) {
        // crea la libreria
        Libreria libreriaConrado = new Libreria("Libreria Conrado");

        // crea algunos productos

        Producto LibrodePinchila = new Producto("Pinchila", "Fadler", 2599.00, 95.0);
        Producto LibrodePinchila2 = new Producto("Pinchila2", "Fradler", 300.00, 100.0);
        Producto LibrodePinchila3 = new Producto("Pinchila3", "Wrangler", 1499.00, 34.0);
        Producto LibrodePinchila4 = new Producto("Pinchila4", "Wrangler", 210.00, 200.0);
        // crea kits

        Kit kit1 = new Kit("Combo1");

        kit1.addPaquete(LibrodePinchila);
        kit1.addPaquete(LibrodePinchila2);
        kit1.addPaquete(LibrodePinchila3);

        Kit kit2= new Kit("Combo2");

        kit2.addPaquete(kit1);
        kit2.addPaquete(LibrodePinchila4);

        // se genera la politica

        Condicion politicaInicial = new CondicionPrecioRango(100.0, 4609.0);

        // se actualiza la politica
        libreriaConrado.setPolitica(politicaInicial);

        //fija si los kits cumplen con la politica de la libreria para publicar en el diario

        System.out.println("kit1 precio: " + kit1.getPrecio());
        System.out.println(libreriaConrado.sePuedePublicar(kit1));

        System.out.println("kit2 precio: " + kit2.getPrecio());
        System.out.println(libreriaConrado.sePuedePublicar(kit2));

        // nuevaPolitica de la libreria
        Condicion politicadeMarca = new CondicionMarca("Fadler");
        Condicion politicaNueva = new CondicionAND(politicaInicial, politicadeMarca);

        libreriaConrado.setPolitica(politicaNueva);

        //fija si ahora con la nueva polioticavlos kits cumplen con la politica de la libreria para publicar en el diario

        System.out.println("kit1 precio: " + kit1.getPrecio() + '\n' + "ki1 marca: " + kit1.getMarca());
        System.out.println(libreriaConrado.sePuedePublicar(kit1));

        System.out.println("kit2 precio: " + kit2.getPrecio() + '\n' + "ki2 marca: " + kit2.getMarca());
        System.out.println(libreriaConrado.sePuedePublicar(kit2));


    }
}
