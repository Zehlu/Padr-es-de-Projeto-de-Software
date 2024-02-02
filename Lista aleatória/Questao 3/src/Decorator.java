public class Decorator implements Hamburguer {
    protected Hamburguer hamburguerDecorado;

    public Decorator(Hamburguer hamburguerDecorado) {
        this.hamburguerDecorado = hamburguerDecorado;
    }

    @Override
    public String montar() {
        return hamburguerDecorado.montar();
    }
}