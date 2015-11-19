package patrones.comportamiento.iterador;

import java.util.*;

public class AgregadoConcreto<T>implements Agregado<T> {
    private final List<T> elementos;

    public AgregadoConcreto(T[] oa) {
        elementos = new ArrayList();
        elementos.addAll(Arrays.asList(oa));
    }

    @Override
    public Iterador<T> crearIterador() {
        return new IteradorConcreto(this);
    }

    @Override
    public Collection<T> elementos() {
        return Collections.unmodifiableList(elementos);
    }
}
