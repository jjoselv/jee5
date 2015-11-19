package patrones.comportamiento.persistencia;

public class Persistencia {
    private final boolean estadoPersistencia;

    Persistencia(boolean state) {
        this.estadoPersistencia = state;
    }

    boolean getEstado() {
        return this.estadoPersistencia;
    }
}
