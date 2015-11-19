package patrones.estructura.ligero;

public class EstadoIntrinseco {
    public EstadoIntrinseco(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    private final boolean estado;
}
