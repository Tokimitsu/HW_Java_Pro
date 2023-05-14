package strategy;

public class FlyWithPropeller implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Fly with Propeller");
    }
}
