package patrones.comportamiento.iterador;

import java.util.*;

public class IteradorConcreto<T> implements Iterador<T> {
    private final Collection<T> elementos;
    private int indice;

    public IteradorConcreto(Agregado a) {
        elementos = a.elementos();
        indice = 0;
    }

    @Override
    public T siguienteObjeto() throws RuntimeException {
        try {
            List<T> l = new ArrayList<>();
            l.addAll(elementos);
            return l.get(indice++);            
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("El elemento no existe.");
        }
    }

    public boolean hayMas() {
        return (indice < elementos.size()) ? true : false;
    }
}
