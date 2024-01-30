public class FabricaClassica implements FabricaAbstrata{

    @Override
    public Componente criarBotao() {
        BotaoClassico botao = new BotaoClassico();
        return botao;
    }
    @Override
    public Componente criarCaixaDeTexto() {
        CaixaDeTextoClassica caixa = new CaixaDeTextoClassica();
        return caixa;
    }
    @Override
    public Componente criarMenu() {
        MenuClassico menu = new MenuClassico();
        return menu;
    }
}
