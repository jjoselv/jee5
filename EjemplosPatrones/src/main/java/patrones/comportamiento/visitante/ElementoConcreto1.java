package patrones.comportamiento.visitante;

public class ElementoConcreto1 implements Elemento {
    @Override
    public void aceptar(Visitante v) {
        v.visitarElementoConcreto1(this);
    }

    public void operacionA() {
        System.out.println("ElementoConcreto1.operacionA() ejecutada");
    }
}
