public class FabricaColonial implements FabricaAbstrata{

    @Override
    public Partes construirFundacao() {
        FundacaoColonial fundacao = new FundacaoColonial();
        return fundacao;
    }
    @Override
    public Partes construirParede() {
        ParedeColonial parede = new ParedeColonial();
        return parede;
    }
    @Override
    public Partes construirTelhado() {
        TelhadoColonial telhado = new TelhadoColonial();
        return telhado;
    }
}
