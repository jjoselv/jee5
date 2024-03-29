/* Generated by Together */

package patrones.estructura.puente.almacenamiento.almacenes;

import java.util.Iterator;
import patrones.estructura.puente.almacenamiento.conexiones.Conexion;
import patrones.estructura.puente.almacenamiento.operaciones.Operacion;
import patrones.estructura.puente.almacenamiento.operaciones.OperacionArchivo;
import java.util.Properties;

class AlmacenArchivo implements Almacen {
    public AlmacenArchivo(Conexion conexion) {
        abrir(conexion);
    }

    Implementador getImplementador() {
        return implementador;
    }

    void setImplementador(Implementador implementador) {
        this.implementador = implementador;
    }

    public final void abrir(Conexion fuente) {
        // Write your code here
        Properties p = fuente.datosConexion();
        setImplementador(new ImplementadorArchivo(p.getProperty("archivo")));
    }

    public void terminar() {
        // Write your code here
        getImplementador().terminar();
    }

    public Iterator ejecutar(Operacion objeto) {
        // Write your code here
        if (objeto instanceof OperacionArchivo) {
            return getImplementador().ejecutar(objeto);
        }
        return null;
    }

    private Implementador implementador;
}
