
public class Main {
    public static void main(String[] args) {

        BotaoClassico botao;
        FabricaClassica microsoft = new FabricaClassica();

        botao = (BotaoClassico) microsoft.criarBotao();
        botao.apertar();

    }
}