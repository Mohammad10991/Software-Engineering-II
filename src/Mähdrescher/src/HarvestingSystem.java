import java.util.*;
import java.awt.*;

public class HarvestingSystem{
    private static boolean turnedOn = false;

    public static void turnOn(){
        turnedOn = true;
    };

    public static void turnOff(){
        turnedOn = false;
    };

    public static void harvest(){
        GrainTank.grainIncrease();
    };
    
}