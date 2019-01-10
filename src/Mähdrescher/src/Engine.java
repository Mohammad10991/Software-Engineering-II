import java.util.*;
import java.awt.*;

public class Engine {
    private static boolean engineOn;

    public static void turnOn(){
        engineOn = true;
        FuelTank.burnFuel();
    };

    public static void turnOff(){
        engineOn = false;
    };

}