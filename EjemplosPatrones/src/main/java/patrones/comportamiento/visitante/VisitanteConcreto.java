package patrones.comportamiento.visitante;

public class VisitanteConcreto implements Visitante {
    @Override
    public void visitarElementoConcreto1(ElementoConcreto1 element1) {
        element1.operacionA();
    }

    @Override
    public void visitarElementoConcreto2(ElementoConcreto2 element2) {
        element2.operacionB();
    }
}
