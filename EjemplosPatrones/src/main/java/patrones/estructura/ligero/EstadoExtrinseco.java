package patrones.estructura.ligero;

public class EstadoExtrinseco {
    private final boolean estado;

    public EstadoExtrinseco(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }
}
