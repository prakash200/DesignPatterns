package Creational.Singleton;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Welcome to Singleton \n");

        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();

        System.out.println(instance1==instance2);
    }
}
