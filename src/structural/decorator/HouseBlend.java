package structural.decorator;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
