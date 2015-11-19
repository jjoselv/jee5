package patrones.comportamiento.mediador;

public class TestMediador {
    public static void main(String[] args) {
        Mediador med = new MediadorConcreto();
        Colega colega1 = new ColegaConcreto1(med);
        Colega colega2 = new ColegaConcreto2(med);
        System.out.println("colega1.toString() [" + colega1 + "]");
        System.out.println("colega2.toString() [" + colega2 + "]");
        ((ColegaConcreto1)colega1).cambioDeEstado();
        System.out.println("colega1.toString() [" + colega1 + "]");
        System.out.println("colega2.toString() [" + colega2 + "]");
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# MediadorConcreto lnkMediadorConcreto; */

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# ColegaConcreto2 lnkColegaConcreto2; */

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# ColegaConcreto1 lnkColegaConcreto1; */
}
