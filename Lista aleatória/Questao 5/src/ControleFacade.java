public class ControleFacade {
    private TV tv;
    private Som som;
    private DVD dvd;
    private Sintonizador sintonizador;

    public ControleFacade() {
        this.tv = new TV();
        this.som = new Som();
        this.dvd = new DVD();
        this.sintonizador = new Sintonizador();
    }

    public void ligar(){
        tv.ligar();
        som.ligar();
        dvd.ligar();
        sintonizador.ligar();
        System.out.println("\nTodos os aparelhos ligados");
    }
    public void desligar(){
        tv.desligar();
        som.desligar();
        dvd.desligar();
        sintonizador.desligar();

        System.out.println("\nTodos os aparelhos desligados");
    }
    public void definirVolume(int volume){
        tv.setVolume(volume);
        som.setVolume(volume);

        System.out.println("\nVolume alterado para " + volume);
    }

    public void definirEntrada(String entrada){
        tv.setEntrada(entrada);
        som.setEntrada(entrada);

        System.out.println("\nEntrada alterado para " + entrada);
    }

    public void definirCanais(String canais){
        dvd.setCanais(canais);
        sintonizador.setCanais(canais);

        System.out.println("\nCanais alterados para " + canais);
    }
}
