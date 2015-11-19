package patrones.comportamiento.estado;

public class EstadoConcreto1 implements Estado {
    @Override
    public void manejar() {
        System.out.println("EstadoConcreto1.manejar() ejecutado");
    }
}
