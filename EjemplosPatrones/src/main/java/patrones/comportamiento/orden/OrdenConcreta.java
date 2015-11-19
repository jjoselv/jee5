package patrones.comportamiento.orden;

public class OrdenConcreta implements Orden {
    private final Receptor receptor;

    public OrdenConcreta(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void ejecutar() {
        receptor.accion();
    }
}
