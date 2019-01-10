import java.util.*;
import java.awt.*;
//import java.util.Comparator;

public class Bordcomputer implements IBordComputer {

 private TreeSet<Wheat> sortedField = new TreeSet<Wheat>();
 private GrainFeld field;
 
 public  Bordcomputer(GrainFeld field){
	this.field=field; 
	 
 }
 @Override
 
public void droneScan(){ // Sorting the Wheat 
	 Drone drone = new Drone();
	 sortedField.addAll(drone.scanField(field));
 }
	
public void sortedPrint() {  // 
	int counter = 0;
	
	for (Wheat wheat : sortedField) {
		System.out.print(" { grains : "+wheat.getNumberOfGrains()+" , Position [ x : "+wheat.getPosition().getPosx()+", y : "+wheat.getPosition().getPosy()+"] }");
		counter++;
		
	if( counter %100 == 0){
		System.out.print("\n");
	}
	}
	System.out.println("\n count : "+sortedField.size());
}

public GrainFeld getField() {
	return field;
}
public void setField( GrainFeld field) {
	this.field=field;
}
}
