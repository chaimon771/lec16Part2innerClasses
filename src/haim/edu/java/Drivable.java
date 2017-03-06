package haim.edu.java;

/**
 * Created by hackeru on 06/03/2017.
 */
public interface Drivable {

    //Constants in Java should upper case and by default "public static final"
    int DRIVER_TAG = 1;
    String DRIVER_LOG = "DrivableLog";

    //by default "public abstract"
    void drive();

    void  turn(double degrees);

    default void print(){
        System.out.println("I'm a Drivable \n**************");
    }

    default void log(String message){
        System.out.println(DRIVER_LOG + " " + message + "\n**************");
    }



}
