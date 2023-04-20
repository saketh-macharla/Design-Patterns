//public class Singleton {
//    private static volatile Singleton instance;
//
//    public String value;
//
//    private Singleton(String value){
//        this.value =  value;
//    }
//
//    public static Singleton getInstance(String value){
//        if(instance == null){
//            synchronized (Singleton.class){
//                if(instance == null){
//                    instance = new Singleton(value);
//                }
//            }
//        }
//        return instance;
//    }
//}


public class ThreadPoolSingleton {
    private static volatile ThreadPoolSingleton instance;


    private ThreadPoolSingleton(){
    }

    public void execute(Thread newThread){
        newThread.start();
    }

    public static ThreadPoolSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadPoolSingleton.class){
                if(instance == null){
                    instance = new ThreadPoolSingleton();
                }
            }
        }
        return instance;
    }
}
