/* Generated by Together */
package patrones.estructura.utilidades;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    protected Agenda() {
        Persona p = new Persona("José López", "jlopez@acme.com");
        personas.add(p);
        p = new Persona("Carlos Armero", "carlos@mbi.com");
        personas.add(p);
        p = new Persona("Luis Rivera", "riveral@nus.com");
        personas.add(p);
    }

    /**
     * gets personas
     *
     * @return personas
     */
    public List<Persona> getPersonas() {
        if (personas == null) {
            personas = new ArrayList<>();
        }
        return personas;
    }

    public void nuevaPersona(Persona persona) {
        getPersonas().add(persona);
    }

    public static Agenda getInstancia() {
        if (instancia == null) {
            instancia = new patrones.estructura.utilidades.Agenda();
        }
        return instancia;
    }

    /**
     * @link
     * @shapeType PatternLink
     * @pattern Adapter
     * @clientRole Adaptado
     * @supplierRole Adaptador
     */

    /*# private patrones.estructura.adaptador.AdaptadorAgenda _adaptadorAgenda; */
    /**
     * @associates <{patrones.estructura.utilidades.Persona}> @directed
     * @clientCardinality 1
     * @supplierCardinality 0..*
     */
    private List<Persona> personas;

    /**
     * @link
     * @shapeType PatternLink
     * @pattern Singleton
     * @supplierRole Factoría Singleton
     */

    /*# private Agenda _agenda; */
    private static Agenda instancia;
}
