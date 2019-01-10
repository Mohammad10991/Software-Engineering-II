import java.util.*;
import java.awt.*;

public class FuelTank {
    private static int fuel = 100;

    public static void burnFuel(){
        fuel--;
    };

    public static void refill(){
        fuel = 100;
    };
}