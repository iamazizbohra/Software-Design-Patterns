package structural.bridge;

public class BridgeTestDriver {
    /*
    Intent:

    Bridge is a structural design pattern that lets you split a large class or a set of closely related classes
    into two separate hierarchies abstraction and implementation which can be developed independently of each other.
     */

    public void run () {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
