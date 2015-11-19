package patrones.comportamiento.persistencia;

public class Cuidador {
    private static Persistencia estado;

    /**
     * @link dependency
     * @stereotype instantiate
     */

    /*# Originador lnkOriginator; */

    public static void hacer() {
        Originador orig = new Originador();
        estado = orig.crearPersistencia();
        orig.mostrarEstatus();
        orig.cambiarEstado();
        orig.mostrarEstatus();
        orig.setPersistencia(estado);
        orig.mostrarEstatus();
    }
}
