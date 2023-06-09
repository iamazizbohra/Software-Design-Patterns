package creational.singleton.eagerly;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getDescription() {
        return "I'm a eagerly created Singleton!";
    }
}
