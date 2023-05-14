package strategy;

public class HomeWorkDuck extends Duck{

    public HomeWorkDuck() {
        flyBehavior = new FlyWithPropeller();
        quackBehavior = new Squeek();
    }
    @Override
    public void display() {

    }
}
