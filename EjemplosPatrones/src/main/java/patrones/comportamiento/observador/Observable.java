package patrones.comportamiento.observador;

import java.util.*;

public abstract class Observable {
    List observadores = new ArrayList();

    public void enganchar(Observador o) {
        observadores.add(o);
    }

    public void desenganchar(Observador o) {
        observadores.remove(observadores.indexOf(o));
    }

    public void notificarCambioDeEstado() {
        for (Iterator it = observadores.iterator(); it.hasNext(); ) {
            ((Observador)it.next()).actualizar();
        }
    }
}
