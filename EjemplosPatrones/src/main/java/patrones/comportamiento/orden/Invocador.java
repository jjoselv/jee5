package patrones.comportamiento.orden;

public class Invocador {
    private Orden orden;

    public void guardarOrden(Orden orden) {
        this.orden = orden;
    }

    public void invocar() {
        orden.ejecutar();
    }
}
