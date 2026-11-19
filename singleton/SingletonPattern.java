package singleton;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager() {
        System.out.println("Object created");
    }

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance=new ConfigurationManager();
        }
        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        ConfigurationManager c1 = ConfigurationManager.getInstance();
        ConfigurationManager c2 = ConfigurationManager.getInstance();
        System.out.println(c1 == c2);
    }
}

