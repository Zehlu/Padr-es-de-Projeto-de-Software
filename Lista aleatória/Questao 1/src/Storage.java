
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Storage extends Subject {
    private List<Produto> estoque = new ArrayList();

    public Storage() {
    }

    public void armazenar(Produto prod) {

        Iterator var1 = this.estoque.iterator();

        if (estoque.contains(prod)){
            while(var1.hasNext()) {
                Produto produto = (Produto)var1.next();

                if (prod.nome == produto.nome){
                    ++produto.quantidade;
                    System.out.println(" ");
                    System.out.println("Produto " + produto.nome + " adicionado ao estoque");
                }
            }

        }else{
            estoque.add(prod);
            System.out.println("Produto " + prod.nome + " adicionado ao estoque");
        }

    }

    public void mudarPreco(Produto prod, float preco) {

        Iterator var1 = this.estoque.iterator();

        while(var1.hasNext()) {
            Produto produto = (Produto)var1.next();

            if (prod.nome == produto.nome){
                produto.preco = preco;
                System.out.println("Produto " + produto.nome + " auterado o preço para: " + produto.preco);
                this.notifyAl();
                System.out.println(" ");
            }
        }
    }

    public void mostrarProdutos() {
        System.out.println("Todas os produtos armazenados:");
        Iterator var1 = this.estoque.iterator();

        while(var1.hasNext()) {
            Produto produto = (Produto)var1.next();
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Quantidade: " + produto.quantidade);
            System.out.println(" ");
        }

    }
}
