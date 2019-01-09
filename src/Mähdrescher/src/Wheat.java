import java.util.*;
public class Wheat implements Comparable<Wheat> {
  private int NumberOfGrain;
  private XYPosition position;
  
public Wheat() {
	
}
public Wheat( int NumberOfGrain , XYPosition position){
	this.NumberOfGrain = NumberOfGrain;
	this.position = position ;
}

public int   NumberofGrain(int LowerLimit , int UpperLimit ) {
	int randomNumber = (int)(Math.random()* UpperLimit);
	//Random random = new Random();
//	int randomNumber = random.nextInt(UpperLimit);
 while(randomNumber < LowerLimit) {
	 randomNumber = (int)(Math.random()* UpperLimit);
			 //random.nextInt(UpperLimit);
 }
 return randomNumber;
}
public  XYPosition getPosition() {
	return position;
}
public void setPosition(XYPosition position) {
	this.position=position;
}
@Override
public int compareTo(Wheat o) {
	int gDifference = -NumberOfGrain + o.NumberofGrain(100,501);
	if(gDifference != 0) {
		return gDifference;
	}
	
	int posxDifference = position.getPosx() - o.getPosition().getPosx();
	if(posxDifference != 0) {
		return posxDifference;
	}
	int posyDifference = position.getPosy() - o.getPosition().getPosy();
	if (posyDifference != 0) {
		return posyDifference;
	}
	
	return 0;
}
}
