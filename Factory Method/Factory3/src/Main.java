import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipo;

        FactoryMethod fabrica = new FactoryMethod();

        System.out.println("Digite o tipo de leitor desejado");
        System.out.println("Opções: \nJSON \nXML \nYAML");
        Scanner scan = new Scanner(System.in);
        tipo = scan.next();

        LeitoresDeConfiguracao docs = fabrica.criar(tipo);
        docs.criar();

    }
}