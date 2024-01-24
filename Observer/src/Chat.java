import java.util.ArrayList;
import java.util.List;

public class Chat extends Subject{

    private List<String> Mensagem = new ArrayList();

    public void enviarMensagem (String mensagem){
        Mensagem.add(mensagem);
        System.out.println(" ");
        System.out.println("Nova mensagem: " + mensagem);
        notifyAl();
        System.out.println(" ");
    }

    public void mostrarMensagens(){
        System.out.println("Todas as notícias:");
        for (String mensagem : Mensagem) {
            System.out.println(mensagem);
        }
    }
}