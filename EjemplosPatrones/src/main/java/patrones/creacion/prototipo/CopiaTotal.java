/* Generated by Together */

package patrones.creacion.prototipo;

import java.io.Serializable;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CopiaTotal implements Serializable {
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public CopiaTotal copiar() {
        try {
            ByteArrayOutputStream salida = new ByteArrayOutputStream();
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(salida);
            salidaObjeto.writeObject(this);
            ByteArrayInputStream entrada = new ByteArrayInputStream(salida.toByteArray());
            ObjectInputStream entradaObjeto = new ObjectInputStream(entrada);
            return (CopiaTotal)entradaObjeto.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String nombre;
}
