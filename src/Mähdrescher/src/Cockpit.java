import java.util.*;
import java.awt.*;
import java.io.*;

//can turn on/off, turn, move and stop
public class Cockpit {

    private static boolean keyTurned;

    public static void turnKey(){
        keyTurned = true;
    };

    public static void takeKeyOut(){              
        keyTurned = false;
    };

    public static void turnLeft(){
        System.out.println("turned left");
    };

    public static void turnRight(){
        System.out.println("turned right");
    };

    public static void forward(){
        System.out.println("drive forward");
        UnderCarriage.move();
    };

    public static void backward(){
        System.out.println("drive backward");
        UnderCarriage.move();
    };

    public static void stop(){
        System.out.println("stop");
        UnderCarriage.stop();
    };
    
}