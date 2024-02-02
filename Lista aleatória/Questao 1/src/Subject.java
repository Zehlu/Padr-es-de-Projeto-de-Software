//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {
    private List<IObserver> observers = new ArrayList();

    public Subject() {
    }

    public void subscribe(IObserver observer) {
        this.observers.add(observer);
        System.out.println("Usuário " + observer.setNome() + " inscrito");
    }

    public void unsubscribe(IObserver observer) {
        this.observers.remove(observer);
        System.out.println("Usuário " + observer.setNome() + " desinscrito");
    }

    public void notify(IObserver observer) {
        observer.update();
    }

    public void notifyAl() {
        Iterator var1 = this.observers.iterator();

        while(var1.hasNext()) {
            IObserver observer = (IObserver)var1.next();
            this.notify(observer);
        }

    }
}
