import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipo;

        FactoryMethod fabrica = new FactoryMethod();

        System.out.println("Digite o tipo de arquivo desejado");
        System.out.println("Opções: \nPDF \nWorDd \nHTML");
        Scanner scan = new Scanner(System.in);
        tipo = scan.next();

        Documentos docs = fabrica.criar(tipo);
        docs.criar();

    }
}