import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String tipo;

        FactoryMethod fabrica = new FactoryMethod();

        System.out.println("Digite o tipo de inimigo desejado");
        System.out.println("Opções: \nSoldado \nMonstro \nChefe");
        Scanner scan = new Scanner(System.in);
        tipo = scan.next();

        Inimigos mob = fabrica.criar(tipo);
        mob.atacar();

    }
}