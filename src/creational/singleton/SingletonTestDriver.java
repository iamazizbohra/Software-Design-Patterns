package creational.singleton;


import creational.singleton.doubleCheckedLocking.Singleton;

public class SingletonTestDriver {
    /*
    Intent:

    The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
     */
    public void run(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
