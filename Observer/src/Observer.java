
public class Observer implements IObserver {
    private int id;
    private String nome;
    private int telefone;

    public Observer(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String setNome() {
        return this.nome;
    }

    @Override
    public void update() {
        System.out.println("Usuário " + this.nome + " notificado");
    }
}