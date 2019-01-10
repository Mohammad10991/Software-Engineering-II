
import java.util.Random;

public class Wheat implements Comparable<Wheat> {
    private int numberOfGrain;
    private XYPosition position;

    public Wheat() {
        Random random = new Random();
        this.numberOfGrain = 100 + random.nextInt(401);
    }

    public int getNumberOfGrains() {
        return numberOfGrain;
    }

    public XYPosition getPosition() {
        return position;
    }

    public void setPosition(XYPosition position) {
        this.position = position;
    }

    @Override
    public int compareTo(Wheat o) {     // Compare to method used for the sorting of the TreeSet 
        int gDifference = -numberOfGrain + o.getNumberOfGrains();
        if(gDifference != 0){
            return gDifference;
        }
        //compare name
        int xDifference = position.getPosx() - o.getPosition().getPosx();
        if(xDifference != 0){
            return xDifference;
        }
        int yDifference = position.getPosy() - o.getPosition().getPosy();
        if(yDifference != 0){
            return yDifference;
        }
        return 0;
    }
}
