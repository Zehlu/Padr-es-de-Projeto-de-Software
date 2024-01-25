import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BaseDeDados {
    private List<Modelo> cadastros = new ArrayList<>();


    public void cadastro(Modelo modelo){
        cadastros.add(modelo);
        System.out.println("Usuário cadastrado");
    }

    public Modelo recuperacao(String nome){
        for (Modelo model: cadastros){
            if(Objects.equals(model.nome, nome)){
                return model;
            }
        }
        System.out.println("Usuário não encontrado");
        return null;
    }

    public void atualizacao(Modelo modelo){
        cadastros.remove(modelo);

        System.out.println("Digite um novo nome e email");

        Scanner myObj = new Scanner(System.in);
        String user = myObj.nextLine();
        String email = myObj.nextLine();

        modelo.nome = user;
        modelo.email = email;

        cadastros.add(modelo);
    }

    public void remocao(Modelo modelo){
        cadastros.remove(modelo);
        System.out.println("Usuário removido");
    }
}
