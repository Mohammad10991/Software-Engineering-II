import java.util.*;
import java.awt.*;

// can turn on/off
public class Engine extends MachineClass{
    private static boolean engineOn;

    public static void turnOn(){
        engineOn = true;
        FuelTank.burnFuel();
    };

    public static void turnOff(){
        engineOn = false;
    };

}