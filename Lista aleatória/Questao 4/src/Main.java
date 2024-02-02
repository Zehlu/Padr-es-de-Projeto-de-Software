
public class Main {
    public static void main(String[] args) {

        FabricaSimples fabricaS = new FabricaSimples();
        FabricaCompleto fabricaC = new FabricaCompleto();

        Relatorio relatorio1 = fabricaS.criarHTML();
        Relatorio relatorio2 = fabricaC.criarPDF();


        relatorio2.criar();
        relatorio1.criar();

    }
}