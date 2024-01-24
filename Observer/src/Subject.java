import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<IObserver> observers = new ArrayList<>();

    public void subscribe(IObserver observer) {
        observers.add(observer);
        System.out.println("Usuário " + observer.setNome() + " inscrito");
    }

    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
        System.out.println("Usuário " + observer.setNome() + " desinscrito");
    }

    public void notify(IObserver observer) {
        observer.update();
    }

    public void notifyAl() {
        for (IObserver observer : observers) {
            notify(observer);
        }
    }
}