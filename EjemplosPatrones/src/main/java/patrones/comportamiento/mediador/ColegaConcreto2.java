package patrones.comportamiento.mediador;

public class ColegaConcreto2 implements Colega {
    private Mediador mediador;
    private String val = "false";

    public ColegaConcreto2(Mediador mediador) {
        this.mediador = mediador;
        mediador.registrar(this);
    }

    public void setValor(String valor) {
        this.val = valor;
    }

    public String toString() {
        return val;
    }
}
