package patrones.comportamiento.estado;

public class TestEstado {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        contexto.peticion();
        contexto.cambiarEstado(Contexto.ESTADO_DOS);
        contexto.peticion();
    }
}
