package Creational.Singleton;

public class MySingleton {

    // 4) Bill Pugh Singleton [ remember ]
    // JVM does NOT load helper class immediately. It loads only when getInstance is called
    // Since class loading is synchronous, this complete process is thraed safe
    // This method is designed/improvised by looking in to JVM object creation steps

    private MySingleton(){}

    private static class SingletonHelper {
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    //     3)Double Check
    //     Efficient when compared with 2nd method.

//    private static MySingleton instance;
//
//    private MySingleton(){};
//
//    public static MySingleton getInstance(){
//        if (instance == null){
//            synchronized (MySingleton.class) {
//                if (instance == null) {
//                    instance = new MySingleton();
//                }
//            }
//
//            }
//        return instance;
//    }



    // 2)Synchronized method  Single ton : Thread Safe [ just added synchronized ]
    // Even after object is created,
    // [instance != null]
    // Every call still uses synchronized lock, which is slow.
    //So performance becomes bad.

//    private static MySingleton instance;
//
//    private MySingleton(){};
//
//    public static synchronized MySingleton getInstance(){
//        if (instance == null){
//            instance =  new MySingleton();
//        }
//        return instance;
//    }



    // 1)Basic Single ton : Not Thread Safe
//    private static MySingleton instance;
//
//    private MySingleton(){};
//
//    public static MySingleton getInstance(){
//        if (instance == null){
//            instance =  new MySingleton();
//        }
//        return instance;
//    }

}
