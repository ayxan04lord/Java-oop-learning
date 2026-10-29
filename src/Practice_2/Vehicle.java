package Practice_2;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Stoplandi");
    }
}
