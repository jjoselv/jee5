/* Generated by Together */

package patrones.creacion.factoriaAbstracta;

class FactoriaDormitorio implements FactoriaMuebles {
    @Override
    public Mueble[] crearMuebles() {
        Mueble[] resultado = new MuebleImpl[3];
        resultado[0] = new MuebleImpl("Cama");
        resultado[1] = new MuebleImpl("Armario empotrado");
        resultado[2] = new MuebleImpl("Mesilla de noche");
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
