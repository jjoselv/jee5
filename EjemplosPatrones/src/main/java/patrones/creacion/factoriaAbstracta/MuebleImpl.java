/* Generated by Together */

package patrones.creacion.factoriaAbstracta;

class MuebleImpl implements Mueble {
    /** Constructs a test case with the given name. */
    public MuebleImpl(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String descripcion() {
        // Write your code here
        return getNombre();
    }
}