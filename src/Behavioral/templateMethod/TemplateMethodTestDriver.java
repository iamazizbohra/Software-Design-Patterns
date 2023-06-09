package Behavioral.templateMethod;

public class TemplateMethodTestDriver {
    /*
    Intent:

    The Template Method Pattern defines the skeleton of an algorithm in a method,
    deferring some steps to subclasses. Template Method lets subclasses redefine
    certain steps of an algorithm without changing the algorithm’s structure.
     */

    public void run() {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
