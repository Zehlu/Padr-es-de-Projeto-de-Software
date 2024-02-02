public class AlfaceDecorator extends Decorator {
    public AlfaceDecorator(Hamburguer hamburguerDecorado) {
        super(hamburguerDecorado);
    }

    @Override
    public String montar() {
        return super.montar() + ", alface";
    }
}