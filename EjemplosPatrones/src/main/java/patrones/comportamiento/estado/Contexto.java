package patrones.comportamiento.estado;

public class Contexto {
    public static final int ESTADO_UNO = 0;
    public static final int ESTADO_DOS = 1;
    private Estado estadoActual = new EstadoConcreto1();

    public void peticion() {
        estadoActual.manejar();
    }

    public void cambiarEstado(int state) {
        switch (state) {
            case ESTADO_UNO:
                estadoActual = new EstadoConcreto1();
                break;
            case ESTADO_DOS:
                estadoActual = new EstadoConcreto2();
                break;
        }
    }
}
