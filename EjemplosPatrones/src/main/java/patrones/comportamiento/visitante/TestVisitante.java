package patrones.comportamiento.visitante;

public class TestVisitante {
    public static void main(String[] args) {
        Elemento[] elementos = new Elemento[2];
        elementos[0] = new ElementoConcreto1();
        elementos[1] = new ElementoConcreto2();
        new EstructuraDeObjetos(elementos).visitarElementos();
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# Elemento lnkElemento; */

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# EstructuraDeObjetos lnkEstructuraDeObjetos; */
}
