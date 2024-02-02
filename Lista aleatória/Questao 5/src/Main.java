
public class Main {
    public static void main(String[] args) {

        ControleFacade controle = new ControleFacade();

        controle.ligar();
        controle.desligar();
        controle.ligar();

        controle.definirVolume(90);


    }
}