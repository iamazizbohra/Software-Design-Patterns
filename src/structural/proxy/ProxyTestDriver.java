package structural.proxy;

public class ProxyTestDriver {
    /*
    Intent:

    The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.
     */

    public void run() {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
