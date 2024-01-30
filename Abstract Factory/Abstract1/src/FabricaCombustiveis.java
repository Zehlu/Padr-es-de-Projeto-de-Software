public class FabricaCombustiveis implements FabricaAbstrata{

    @Override
    public Veiculo criarCarro() {
        CarroACombustivel carro = new CarroACombustivel();
        return carro;
    }
    @Override
    public Veiculo criarMoto() {
        MotoACombustivel moto = new MotoACombustivel();
        return moto;
    }
}
