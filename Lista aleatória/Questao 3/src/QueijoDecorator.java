public class QueijoDecorator extends Decorator {
    public QueijoDecorator(Hamburguer hamburguerDecorado) {
        super(hamburguerDecorado);
    }

    @Override
    public String montar() {
        return super.montar() + ", queijo";
    }
}