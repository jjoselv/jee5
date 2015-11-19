/* Generated by Together */
package patrones.estructura.mvc.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    protected Catalogo() {
    }

    /**
     * gets temas
     *
     * @return temas
     */
    public List<Tema> getTemas() {
        if (temas == null) {
            temas = new ArrayList<>();
        }
        return temas;
    }

    public void nuevoTema(Tema tema) {
        getTemas().add(tema);
    }

    public static Catalogo getInstancia() {
        if (instancia == null) {
            instancia = new Catalogo();
        }
        return instancia;
    }

    /**
     * @associates <{Tema}> @clientCardinality 1
     * @supplierCardinality 0..*
     */
    private List<Tema> temas;

    /**
     * @link
     * @shapeType PatternLink
     * @pattern Singleton
     * @supplierRole Factoría Singleton
     */

    /*# private Catalogo _catalogo; */
    private static Catalogo instancia = null;
}
