
public class Main {
    public static void main(String[] args) {


        CarroEletrico modelX;
        FabricaEletricos tesla = new FabricaEletricos();

        modelX = (CarroEletrico) tesla.criarCarro();

        modelX.andar();
    }
}