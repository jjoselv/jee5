package patrones.comportamiento.persistencia;

public class Originador {
    private boolean estado;

    public void setPersistencia(Persistencia persistencia) {
        this.estado = persistencia.getEstado();
    }

    public Persistencia crearPersistencia() {
        return new Persistencia(estado);
    }

    public void cambiarEstado() {
        estado = estado ? false : true;
    }

    public void mostrarEstatus() {
        System.out.println("Originador.mostrarStatus() informa; estado es actualmente [" + estado + "]");
    }
}
