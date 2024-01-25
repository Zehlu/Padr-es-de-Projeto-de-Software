
public class Main {
    public static void main(String[] args) {

        Modelo user = new Modelo("Jose", "zehlu");
        BaseDeDados bd = new BaseDeDados();
        Facade faca = new Facade();

        /*
        Ao invés de realizar 4 códigos para verificar o crud, é utilizado apenas 1

        bancodedados.cadastro(modelo);
        System.out.println("Email do Usuário:" + bancodedados.recuperacao("Jose").email);
        bancodedados.atualizacao(modelo);
        bancodedados.remocao(modelo);

        */

        faca.verificarCrud(user);

    }
}