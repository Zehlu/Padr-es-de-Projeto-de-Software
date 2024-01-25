public class Facade {
    private BaseDeDados bancodedados;

    public Facade() {
        this.bancodedados = new BaseDeDados();
    }


    public void verificarCrud(Modelo modelo){
        this.bancodedados.cadastro(modelo);
        System.out.println("Email do Usuário:" + this.bancodedados.recuperacao(modelo.nome).email);
        this.bancodedados.atualizacao(modelo);
        this.bancodedados.remocao(modelo);
    }
}
