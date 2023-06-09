package structural.adapter;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Mallard Duck is quacking");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is flying");
    }
}
