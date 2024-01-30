public class FabricaEletricos implements FabricaAbstrata{

    @Override
    public Veiculo criarCarro() {
        CarroEletrico carro = new CarroEletrico();
        return carro;
    }
    @Override
    public Veiculo criarMoto() {
        MotoEletrica moto = new MotoEletrica();
        return moto;
    }
}
