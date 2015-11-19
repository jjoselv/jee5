package patrones.comportamiento.iterador;

import java.util.*;

public interface Agregado<T> {
    public Iterador<T> crearIterador();

    public Collection<T> elementos();
}
