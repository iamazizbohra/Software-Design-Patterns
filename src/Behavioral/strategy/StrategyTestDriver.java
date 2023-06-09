package Behavioral.strategy;

public class StrategyTestDriver {
    /*
    Intent:

    Define a family of algorithms, encapsulate each one, and
    make them interchangeable. Strategy lets the algorithm vary
    independently of the clients that use it.
     */

    public void run() {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
