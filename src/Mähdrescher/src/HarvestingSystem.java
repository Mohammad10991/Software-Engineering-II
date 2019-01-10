import java.util.*;
import java.awt.*;

// can turn on/off and harvest grain
public class HarvestingSystem extends MachineClass{
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