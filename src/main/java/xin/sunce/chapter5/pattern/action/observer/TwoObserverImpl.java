package xin.sunce.chapter5.pattern.action.observer;

public class TwoObserverImpl implements Observer {

    @Override
    public void notify(String msg) {
        System.out.println("I am two ,receive notify:" + msg);
    }
}
