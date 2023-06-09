package Behavioral.visitor;

public class VisitorTestDriver {
    /*
    Intent:

    Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
     */

    public void run() {
        VisitableItem[] items = new VisitableItem[]{
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(VisitableItem[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        int sum = 0;
        for (VisitableItem item : items) {
            sum = sum + item.accept(visitor);
        }

        return sum;
    }
}
