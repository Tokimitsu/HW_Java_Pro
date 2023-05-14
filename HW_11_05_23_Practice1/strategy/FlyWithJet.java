package strategy;

public class FlyWithJet implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with jet");
    }
}
