package xin.sunce.chapter5.pattern.action.chain;

public class BHandler implements Handler {

    @Override
    public void doHandle() {
        System.out.println("Handler is B.");
    }
}
