/* Generated by Together */

package patrones.estructura.puente.almacenamiento.conexiones;

import java.util.Properties;

public class ConexionArchivo implements Conexion {
    public ConexionArchivo(String nombre) {
        setNombreArchivo(nombre);
    }

    @Override
    public Properties datosConexion() {
        // Write your code here
        Properties p = new Properties();
        p.setProperty("archivo", getNombreArchivo());
        return p;
    }

    public String getNombreArchivo() { return nombreArchivo; }

    public final void setNombreArchivo(String nombreArchivo) { this.nombreArchivo = nombreArchivo; }

    private String nombreArchivo;
}