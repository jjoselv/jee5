package patrones.estructura.ligero;

public class LigeroConcreto implements Ligero {
    private final boolean estadoIntrinseco;

    /**
     * @param estadoIntrinseco
     * @link dependency
     * @stereotype call
     */

    /*# EstadoIntrinseco lnkEstadoIntrinseco; */

    public LigeroConcreto(EstadoIntrinseco estadoIntrinseco) {
        this.estadoIntrinseco = estadoIntrinseco.getEstado();
    }

    @Override
    public void operacion(EstadoExtrinseco estadoExtrinseco) {
        // usar el estado suministrado por el cliente y el propio
        System.out.println("LigeroConcreto.operacion(EstadoExtrinseco estadoExtrinseco) en ejecución\n" +
            "Estado intrínseco = " + estadoIntrinseco + "\n" + "Estado Extrínseco = " + estadoExtrinseco.getEstado());
    }
}
