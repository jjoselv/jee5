package patrones.comportamiento.iterador;

public class TestIterador {
    public static void main(String[] args) {
        String[] lista = {"uno", "dos", "tres", "cuatro", "cinco", "seis" };
        Agregado<String> ag = new AgregadoConcreto(lista);
        Iterador<String> iter = ag.crearIterador();
        while (iter.hayMas()) {
            System.out.println(iter.siguienteObjeto());
        }
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# AgregadoConcreto lnkAgregadoConcreto; */

    /**
     * @link dependency
     * @stereotype access
     */

    /*# Iterador lnkIterador; */
}
