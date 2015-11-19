/* Generated by Together */

package patrones.creacion.factoriaAbstracta;

class FactoriaSalon implements FactoriaMuebles {
    @Override
    public Mueble[] crearMuebles() {
        Mueble[] resultado = new MuebleImpl[3];
        resultado[0] = new MuebleImpl("Sillón");
        resultado[1] = new MuebleImpl("Mesa comedor");
        resultado[2] = new MuebleImpl("Silla");
        return resultado;
    }

    /**
     * @link
     * @shapeType PatternLink
     * @pattern AbstractFactory
     * @supplierRole Producto
     */

    /*# private MuebleImpl _muebleImpl; */
}