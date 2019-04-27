package observer;

import java.util.ArrayList;

public class Child implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer object) {
        observers.add(object);
    }

    @Override
    public void disttach(Observer object) {
        observers.remove(object);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers)
            observer.update();
    }


    public void doBad(){
        System.out.println("小明又做坏事了");
        notifyObserver();
    }
}
