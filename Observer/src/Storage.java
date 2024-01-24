import java.util.ArrayList;
import java.util.List;


public class Storage extends Subject{

    private List<Produto> estoque = new ArrayList<>();

    public void armazenar(Produto produto){
        estoque.add(produto);
        produto.quantidade += 1;
        System.out.println(" ");
        System.out.println("Produto " + produto.nome + " auterado a quantidade armazenada para: " + produto.quantidade);
        notifyAl();
        System.out.println(" ");
    }

    public void mostrarProdutos(){
        System.out.println("Todas os produtos armazenados:");
        for (Produto produto : estoque) {
            System.out.println(produto.nome);
        }
    }
}