package patrones.comportamiento.plantilla;

public abstract class ClaseAbstracta {
    public void metodoPlantilla() {
        System.out.println("ClaseAbstracta.metodoPlantilla() ejecutando...");
        operacionPrimitiva1();
        operacionPrimitiva2();
    }

    public abstract void operacionPrimitiva1();

    public abstract void operacionPrimitiva2();
}
