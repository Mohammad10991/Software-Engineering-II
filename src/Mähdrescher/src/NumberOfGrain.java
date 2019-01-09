import java.util.Random;
public  class NumberOfGrain {
    /*private int UpperLimit;
    rivate int LowerLimit;*/
    static void RandomNumber(int UpperLimit , int LowerLimit){
        Random random = new Random();
        int randomnumber = random.nextInt(UpperLimit);
        
        while(randomnumber < LowerLimit){
            randomnumber = random.nextInt(UpperLimit);
        }
       
    }
    
}