package strategy;

public class Qunack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("qunack");
    }
}
