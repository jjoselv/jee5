package patrones.comportamiento.mediador;

public class ColegaConcreto1 implements Colega {
    private final Mediador mediador;
    private boolean estado;

    public ColegaConcreto1(Mediador mediador) {
        this.mediador = mediador;
        mediador.registrar(this);
    }

    public void cambioDeEstado() {
        estado = !estado;
        mediador.cambioDeEstado();
    }

    @Override
    public String toString() {
        return Boolean.toString(estado);
    }
}
