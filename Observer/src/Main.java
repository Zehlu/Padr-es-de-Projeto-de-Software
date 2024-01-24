
public class Main {

    static Observer user1 = new Observer(37997645, "José", 996225994);
    static Observer user2 = new Observer(88871268, "Mariana", 999297756);


    public static void main(String[] args) {
        //questao1();
        //questao2();
        //questao3();
        //questao4();
        //questao5();

    }
    public static void questao1(){
        ClickCounter mouse = new ClickCounter();

        mouse.subscribe(user1);
        mouse.subscribe(user2);

        mouse.click();

        mouse.unsubscribe(user2);

        mouse.click();
    }

    public static void questao2 (){
        TemperatureAlert termometro = new TemperatureAlert();

        termometro.subscribe(user1);
        termometro.subscribe(user2);

        termometro.mudarTemperatura(12);

        termometro.unsubscribe(user2);

        termometro.mudarTemperatura(145);
    }

    public static void questao3 (){
        NewsAlert oglobo = new NewsAlert();

        oglobo.subscribe(user1);
        oglobo.subscribe(user2);

        oglobo.enviarNoticia("General Cosaco executa 12 vendedores de camisa de time");
        oglobo.enviarNoticia("Vacinas contra fimose começam a se comercializadas");

        oglobo.unsubscribe(user1);

        oglobo.enviarNoticia("Torcedor tricolor é encontrado com 12 kgs de kmed");
    }

    public static void questao4 (){
        Storage deposito = new Storage();

        Produto prod1 = new Produto("coca", 10);
        Produto prod2 = new Produto("pepsi", 8);


        deposito.subscribe(user1);
        deposito.subscribe(user2);

        deposito.armazenar(prod1);
        deposito.armazenar(prod2);

        deposito.unsubscribe(user2);

        deposito.armazenar(prod1);

        deposito.mostrarProdutos();
    }

    public static void questao5 (){
        Chat wpp2 = new Chat();

        wpp2.subscribe(user1);
        wpp2.subscribe(user2);

        wpp2.enviarMensagem("LP beats, você fez de novo");
        wpp2.enviarMensagem("DJ Mu540, manda pra elas seu fdp");

        wpp2.unsubscribe(user2);

        wpp2.enviarMensagem("Salve Malak");

        wpp2.mostrarMensagens();
    }
}