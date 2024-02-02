public abstract class Eletronico {
    boolean estaLigado;

    public Eletronico() {
        this.estaLigado = false;
    }

    public void ligar(){
        this.estaLigado = true;
    }
    public void desligar(){
        this.estaLigado = false;
    }
}
