/* Generated by Together */

package patrones.estructura.puente.almacenamiento.almacenes;

import java.util.Iterator;
import patrones.estructura.puente.almacenamiento.operaciones.Operacion;

public interface Almacen {
    void terminar();

    Iterator ejecutar(Operacion objeto);
}