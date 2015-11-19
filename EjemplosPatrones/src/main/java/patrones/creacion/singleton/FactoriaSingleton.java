/* Generated by Together */
package patrones.creacion.singleton;

public class FactoriaSingleton {

    private FactoriaSingleton() {
    }

    public static Objeto getInstancia() {
        if (instancia == null) {
            instancia = new ObjetoImpl();
        }
        return instancia;
    }

    private static ObjetoImpl instancia = null;
}
