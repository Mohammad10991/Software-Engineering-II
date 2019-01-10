
// can move or stop
public class UnderCarriage {
    private static boolean moving;

    public static void move(){
        moving = true;
    };

    public static void stop(){
        moving = false;
    }
}