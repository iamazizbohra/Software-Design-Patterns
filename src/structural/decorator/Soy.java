package structural.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
