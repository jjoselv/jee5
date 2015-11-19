package patrones.comportamiento.plantilla;

public class TestPlantilla {
    public static void main(String[] args) {
        ClaseAbstracta ac = new ClaseConcreta();
        ac.metodoPlantilla();
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# ClaseConcreta lnkClaseConcreta; */
}
