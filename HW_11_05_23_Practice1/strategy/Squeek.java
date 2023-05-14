package strategy;

public class Squeek implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeek");
    }
}
