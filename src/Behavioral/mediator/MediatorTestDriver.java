package Behavioral.mediator;

public class MediatorTestDriver {
    /*
    Intent:

    Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
    The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
     */

    public void run() {
        IATCMediator atcMediator = new ATCMediator();
        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.registerFlight(sparrow101);
        atcMediator.registerRunway(mainRunway);
        sparrow101.getReady();
        mainRunway.land();
        sparrow101.land();
    }
}
