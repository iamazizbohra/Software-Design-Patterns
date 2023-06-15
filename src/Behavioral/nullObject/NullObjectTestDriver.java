package Behavioral.nullObject;

public class NullObjectTestDriver {
    /*
    Intent:

    The intent of a Null Object is to encapsulate the absence of an object
    by providing a substitutable alternative that offers suitable default
    do nothing behavior. In short, a design where "nothing will come of nothing"
     */

    public void run() {
        Customer customer1 = CustomerFactory.getCustomer("Rob");
        Customer customer2 = CustomerFactory.getCustomer("Bob");
        Customer customer3 = CustomerFactory.getCustomer("Julie");
        Customer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers: ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
