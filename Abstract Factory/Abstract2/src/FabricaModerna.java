public class FabricaModerna implements FabricaAbstrata{


    @Override
    public Componente criarBotao() {
        BotaoModerno botao = new BotaoModerno();
        return botao;
    }
    @Override
    public Componente criarCaixaDeTexto() {
        CaixaDeTextoModerna caixa = new CaixaDeTextoModerna();
        return caixa;
    }
    @Override
    public Componente criarMenu() {
        MenuModerno menu = new MenuModerno();
        return menu;
    }
}
