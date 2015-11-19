package patrones.comportamiento.estrategia;

public class TestEstrategia {
    public static void main(String[] args) {
        Estrategia estrategia1 = new EstrategiaConcreta1();
        Estrategia estrategia2 = new EstrategiaConcreta2();
        Estrategia estrategia3 = new EstrategiaConcreta3();
        new Contexto(estrategia1).metodoContexto();
        new Contexto(estrategia2).metodoContexto();
        new Contexto(estrategia3).metodoContexto();
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# Estrategia lnkEstrategia; */

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# Contexto lnkContexto; */
}
