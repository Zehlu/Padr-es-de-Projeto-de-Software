public class FabricaContemporanea implements FabricaAbstrata{

    @Override
    public Partes construirFundacao() {
        FundacaoContemporanea fundacao = new FundacaoContemporanea();
        return fundacao;
    }
    @Override
    public Partes construirParede() {
        ParedeContemporanea parede = new ParedeContemporanea();
        return parede;
    }
    @Override
    public Partes construirTelhado() {
        TelhadoContemporaneo telhado = new TelhadoContemporaneo();
        return telhado;
    }
}