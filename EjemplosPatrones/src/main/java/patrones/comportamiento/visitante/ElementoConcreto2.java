package patrones.comportamiento.visitante;

public class ElementoConcreto2 implements Elemento {
    @Override
    public void aceptar(Visitante v) {
        v.visitarElementoConcreto2(this);
    }

    public void operacionB() {
        System.out.println("ElementoConcreto2.operacionB() ejecutada");
    }
}
