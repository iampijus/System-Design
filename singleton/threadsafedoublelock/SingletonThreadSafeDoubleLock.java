package singleton.threadsafedoublelock;

class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private ConfigurationManager() {
        System.out.println("Object created");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}

public class SingletonThreadSafeDoubleLock {

}
