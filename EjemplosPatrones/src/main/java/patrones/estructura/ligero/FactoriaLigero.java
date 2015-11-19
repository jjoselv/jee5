package patrones.estructura.ligero;

import java.util.*;

public class FactoriaLigero {
    private static final Map<String,Ligero> LIGEROS = new HashMap<>();

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# LigeroConcreto lnkLigeroConcreto; */

    /**
     * @param key
     * @return 
     * @link dependency
     * @stereotype instantiate
     */

    /*# EstadoIntrinseco lnkEstadoIntrinseco; */

    /* Devuelve un objeto existente, de lo contrario lo crea y entonces lo devuelve */

    public static Ligero obtenerLigero(String key) {
        Ligero ligero = null;
        try {
            if (LIGEROS.containsKey(key)) {
                ligero = LIGEROS.get(key);
            } else {
                // crear uno nuevo con un estado arbitrario
                ligero = new LigeroConcreto(new EstadoIntrinseco(true));
                LIGEROS.put(key, ligero);
            }
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        return ligero;
    }
}
