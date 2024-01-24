import java.util.ArrayList;
import java.util.List;

public class NewsAlert extends Subject{

    private List<String> noticias = new ArrayList();

    public void enviarNoticia (String noticia){
        noticias.add(noticia);
        System.out.println(" ");
        System.out.println("Nova notícia: " + noticia);
        notifyAl();
        System.out.println(" ");
    }

    public void mostrarNoticias(){
        System.out.println("Todas as notícias:");
        for (String noticia : noticias) {
            System.out.println(noticia);
        }
    }
}