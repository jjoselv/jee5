package patrones.comportamiento.orden;

public class ReceptorB implements Receptor {
    @Override
    public void accion() {
        System.out.println("Ejecutando acción en receptor B");
    }
}
