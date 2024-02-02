
public class Main {
    public static void main(String[] args) {


        Hamburguer meuHamburguer = new HamburguerSimples();
        meuHamburguer = new QueijoDecorator(meuHamburguer);
        meuHamburguer = new AlfaceDecorator(meuHamburguer);

        System.out.println("Hambúrguer: " + meuHamburguer.montar());


    }
}