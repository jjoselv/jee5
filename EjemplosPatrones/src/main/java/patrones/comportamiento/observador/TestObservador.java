package patrones.comportamiento.observador;

public class TestObservador {
    public static void main(String[] args) {
        Observador observador1 = new ObservadorConcreto();
        Observador observador2 = new ObservadorConcreto();
        ObservableConcreto observable = new ObservableConcreto();
        observable.enganchar(observador1);
        observable.enganchar(observador2);
        ObservableConcreto.setEstado(true);
        observable.notificarCambioDeEstado();
        observable.desenganchar(observador1);
        ObservableConcreto.setEstado(false);
        observable.notificarCambioDeEstado();
    }

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# ObservadorConcreto lnkobservadorConcreto; */

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# ObservableConcreto lnkObservableConcreto; */
}
