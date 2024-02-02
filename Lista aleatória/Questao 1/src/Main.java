
public class Main {
    public static void main(String[] args) {

        Observer user1 = new Observer(37997645, "José", 996225994);
        Observer user2 = new Observer(88871268, "Mariana", 999297756);

        Storage deposito = new Storage();
        Produto prod1 = new Produto("coca", 10);
        Produto prod2 = new Produto("pepsi", 8);


        deposito.subscribe(user1);
        deposito.subscribe(user2);

        System.out.println(" ");

        deposito.armazenar(prod1);
        deposito.armazenar(prod2);

        System.out.println(" ");

        deposito.mostrarProdutos();

        deposito.mudarPreco(prod2, 12);

        deposito.mostrarProdutos();


    }
}