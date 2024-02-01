import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipo;

        FactoryMethod fabrica = new FactoryMethod();

        System.out.println("Digite o tipo de evento:");
        System.out.println("Opções: \nErro \nAviso \nInformativo");
        Scanner scan = new Scanner(System.in);
        tipo = scan.next();

        Eventos evento = fabrica.criar(tipo);
        evento.criar();

    }
}