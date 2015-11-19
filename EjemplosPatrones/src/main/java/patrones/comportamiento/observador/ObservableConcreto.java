package patrones.comportamiento.observador;

public class ObservableConcreto extends Observable {
    private static boolean estadoObservable;

    public static boolean getEstado() {
        return estadoObservable;
    }

    public static void setEstado(boolean estado) {
        estadoObservable = estado;
    }
}
