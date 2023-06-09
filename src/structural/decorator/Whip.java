package structural.decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
