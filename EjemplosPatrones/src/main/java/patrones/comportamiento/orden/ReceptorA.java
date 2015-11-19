package patrones.comportamiento.orden;

public class ReceptorA implements Receptor {
    @Override
    public void accion() {
        System.out.println("Ejecutando acción en receptor A");
    }
}
