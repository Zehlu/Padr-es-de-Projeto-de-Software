
public class Main {
    public static void main(String[] args) {

        TelhadoColonial telhado;
        FabricaColonial fabrica = new FabricaColonial();

        telhado = (TelhadoColonial) fabrica.construirTelhado();
        telhado.construir();
    }
}