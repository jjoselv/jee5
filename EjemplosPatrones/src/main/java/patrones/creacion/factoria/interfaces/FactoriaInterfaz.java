/* Generated by Together */

package patrones.creacion.factoria.interfaces;

import patrones.creacion.factoria.herencia.VehiculoDesconocidoException;

public class FactoriaInterfaz {
    public static void main(String[] args) {
        System.out.println("Ejemplo de uso del patrón factoría implementado usando interfaces");
        ejecutarPatron();
        System.out.println("Fin ejemplo de uso del patrón factoría implementado usando interfaces");
    }

    public static void ejecutarPatron() {
        try {
            // message #1.1 to f:patrones.creacion.factoria.interfaces.FactoriaImpl
            Factoria f = new FactoriaImpl();
            // message #1.2 to f:patrones.creacion.factoria.interfaces.FactoriaImpl
            Vehiculo vehiculo = f.obtenerVehiculo(Factoria.COCHE);
            System.out.println(vehiculo.descripcion());
        }
        catch (VehiculoDesconocidoException e) {
            e.printStackTrace();
        }
    }
}
