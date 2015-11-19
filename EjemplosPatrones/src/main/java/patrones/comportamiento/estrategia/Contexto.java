package patrones.comportamiento.estrategia;

public class Contexto {
    Estrategia estrategia;

    public Contexto(Estrategia s) {
        this.estrategia = s;
    }

    public void metodoContexto() {
        estrategia.InterfaceDelAlgoritmo();
    }
}
