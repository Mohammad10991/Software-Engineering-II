
//can get grain and empty the tank
public class GrainTank implements IGrainTank{
    private static int amountGrain = 0;
    private static boolean tankFull = false;

    public  void emptyTank(){
        amountGrain = 0;
    };

    public static void grainIncrease(){
        amountGrain = 100;

    };


}