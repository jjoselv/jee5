package patrones.estructura.intermediario;

public class Intermediario implements Intermediado {
    private final IntermediadoConcreto ic = new IntermediadoConcreto();

    @Override
    public void peticion() {
        ic.peticion();
    }
}
