package Behavioral.strategy;

public abstract class Duck {
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    abstract void display();

    public void swim() {
        System.out.println("All ducks float,even decoys !");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
