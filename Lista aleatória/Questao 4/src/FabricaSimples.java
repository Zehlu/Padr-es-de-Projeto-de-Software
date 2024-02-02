public class FabricaSimples implements FabricaAbstrata{

    @Override
    public Relatorio criarHTML() {
        return new HTMLSimples();
    }

    @Override
    public Relatorio criarPDF() {
        return new PDFSimples();
    }
}
