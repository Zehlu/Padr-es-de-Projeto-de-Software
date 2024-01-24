public class Produto{
    String nome;
    int preco;
    int quantidade;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }
}