package patrones.estructura.intermediario;

public class IntermediadoConcreto implements Intermediado {
    @Override
    public void peticion() {
        System.out.println("IntermediadoConcreto.peticion() en ejecución");
    }
}
