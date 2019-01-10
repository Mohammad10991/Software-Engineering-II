import java.util.*;
import java.awt.*;

public class Harvester{
    public static void allStart() {
        Cockpit.turnKey();
        Engine.turnOn();
        HarvestingSystem.turnOn();
    };

    public static void allMove() {
        Cockpit.forward();
        HarvestingSystem.harvest();
    };

    public static void allStop() {
        Cockpit.stop();
        Cockpit.takeKeyOut();
        Engine.turnOff();
        HarvestingSystem.turnOff();
        FuelTank.refill();
    };
}