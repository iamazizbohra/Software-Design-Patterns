package creational.singleton.doubleCheckedLocking;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }

    public String getDescription() {
        return "I'm a double-checked-locking Singleton!";
    }
}
