/**
 * Early Instantiation of singleton design pattern (creation of the instance at load time)
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}

/**
 * Lazy Instantiation of Singleton design pattern (creation of the instance when required)
 */
class SingletonLazy {

    private static SingletonLazy INSTANCE;

    private SingletonLazy() {
    }

    public static SingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}


/**
 * Lazy Instantiation of Singleton.Bill Pugh Singleton Implementation
 */
class BillPluginSingleton {
    private BillPluginSingleton() {

    }

    private static class Singleton {

        private static BillPluginSingleton INSTANCE = new BillPluginSingleton();
    }

    public static BillPluginSingleton getInstance() {
        return Singleton.INSTANCE;
    }
}
