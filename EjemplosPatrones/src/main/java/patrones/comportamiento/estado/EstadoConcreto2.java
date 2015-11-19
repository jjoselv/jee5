package patrones.comportamiento.estado;

public class EstadoConcreto2 implements Estado {
    @Override
    public void manejar() {
        System.out.println("EstadoConcreto2.manejar() ejecutado");
    }
}
