/* Generated by Together */

package patrones.estructura.puente.almacenamiento.almacenes;

import java.util.Iterator;
import patrones.estructura.puente.almacenamiento.operaciones.Operacion;

public interface Implementador {
    Iterator ejecutar(Operacion objeto);

    public abstract void terminar();
}
