package patrones.comportamiento.visitante;

import java.util.*;

public class EstructuraDeObjetos {
    private final List objetos;
    private Visitante visitante;

    public EstructuraDeObjetos(Elemento[] elementos) {
        objetos = Arrays.asList(elementos);
    }

    public void visitarElementos() {
        if (visitante == null) { visitante = new VisitanteConcreto(); }
        for (Iterator iter = objetos.iterator(); iter.hasNext(); ) {
            ((Elemento)iter.next()).aceptar(visitante);
        }
    }
}
