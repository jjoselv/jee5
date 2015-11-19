package patrones.comportamiento.mediador;

public class MediadorConcreto implements Mediador {
    Colega colega1;
    Colega colega2;

    @Override
    public void registrar(Colega colega) {
        if (colega instanceof ColegaConcreto1) {
            this.colega1 = (ColegaConcreto1)colega;
        } else if (colega instanceof ColegaConcreto2) {
            this.colega2 = (ColegaConcreto2)colega;
        }
    }

    @Override
    public void cambioDeEstado() {
        String s = (colega2.toString().equals("false")) ? "true" : "false";
        ((ColegaConcreto2)colega2).setValor(s);
    }
}
