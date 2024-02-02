

public class Produto {
    String nome;
    float preco;
    int quantidade;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 1;
    }

    public String getNome() {
        return this.nome;
    }
}
