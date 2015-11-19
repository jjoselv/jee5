package patrones.comportamiento.observador;

public class ObservadorConcreto implements Observador {
    private boolean estadoObservador;
    private ObservableConcreto observable;

    @Override
    public void actualizar() {
        if (observable == null) { observable = new ObservableConcreto(); }
        estadoObservador = ObservableConcreto.getEstado();
        System.out.println("ObservadorConcreto.actualizar() informa que estadoObservador es ahora " + estadoObservador);
    }
}
