import java.util.*;
public class Drone {

	public HashSet<Wheat> scanField(GrainFeld f){ // Position to all Wheat Plants
		HashSet<Wheat> hashSet = new HashSet<>();
		for ( int i = 0; i < f.getposx();i++) {
			for(int j = 0; j < f.getposy();j++) {
				XYPosition position = new XYPosition(i ,j );
				Wheat[][] fieldArray = f.getFieldArray();
				fieldArray[i][j].setPosition(new XYPosition(i,j));
				hashSet.add(fieldArray[i][j]);
				
			}
		}
		
		return hashSet;
		
	}
}
