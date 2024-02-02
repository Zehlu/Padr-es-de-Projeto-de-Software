public class FabricaCompleto implements FabricaAbstrata{

    @Override
    public Relatorio criarHTML() {
        return new HTMLCompleto();
    }

    @Override
    public Relatorio criarPDF() {
        return new PDFCompleto();
    }
}
