package strategy;

public class QryackDuck extends Duck{


    public QryackDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Qryack();
    }

    @Override
    public void display() {

    }
}
