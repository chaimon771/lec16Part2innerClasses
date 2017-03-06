package haim.edu.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.print();


        c.drive();
        c.log("Started Driving");


        c.turn(30);
        c.log("Turned by 30 degrees");



        int x = Drivable.DRIVER_TAG;
        c.log("this is my Driver Tag: " + x);

        System.out.println(Car.DRIVER_LOG);
        //or int y = c.DRIVER_TAG;
        c.log("123123");


    }
}
