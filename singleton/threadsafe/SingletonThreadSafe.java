package singleton.threadsafe;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager() {
        System.out.println("Object created");
    }

    synchronized public static  ConfigurationManager getInstance(){
        if(instance==null){
            instance=new ConfigurationManager();
        }
        return instance;
    }
}

public class SingletonThreadSafe {
    public static void main(String[] args){

    }
}
