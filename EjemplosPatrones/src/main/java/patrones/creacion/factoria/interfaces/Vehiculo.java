/* Generated by Together */

package patrones.creacion.factoria.interfaces;

public interface Vehiculo {
    String descripcion();

    /**
     * @link
     * @shapeType PatternLink
     * @pattern Factory Method
     * @supplierRole Creador
     * @hidden
     */

    /*# private Factoria _factoria; */

    /**
     * @link
     * @shapeType PatternLink
     * @pattern Factory Method
     * @supplierRole Objeto creado
     */

    /*# private Coche _coche; */

    /**
     * @link dependency
     * @supplierRole Objeto Creado
     */

    /*# Moto lnkMoto; */
}
