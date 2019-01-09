//import java.util.Random;
//import java.util.*;
public class Application {

	public static void main(String[] args) {
	 // Wheat numberofgrain = new Wheat();
	 //int x = numberofgrain.NumberofGrain(100,501);
	  //System.out.println(x);
	 // List <Wheat> Liste = new ArrayList<>();
  GrainFeld field = new GrainFeld();
  Bordcomputer bordcomputer = new Bordcomputer(field);
  System.out.println(" Scannen............");
  field.getGrainFeld();
  
  System.out.println("Sortierte Liste im Bordcomputer : ");
  bordcomputer.droneScan();
  bordcomputer.sortedPrint();
	}
}
