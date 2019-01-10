
public class GrainFeld {
 private Wheat grainFeldArray [][];
 private int posx = 20;
 private int posy = 20;
 
 
 public GrainFeld(){
	 grainFeldArray = new Wheat[posx][posy]; // tow dimm Array for Wheat Plants

	 for (int i = 0 ; i < posx; i++) {    
		 for (int j = 0; j < posy ; j++) {
			grainFeldArray [j][i] = new Wheat(); 
		 }
	 }
 }
 
 public void getGrainFeld() {
	 for(int i = 0 ; i < posx ; i++) {
		 for(int j = 0 ; j < posy ; j++) {
			 Wheat index = grainFeldArray[j][i];
			 System.out.print(" [pos: ("+ i +" , "+ j +") : ");
			 System.out.print(index.getNumberOfGrains()+" ] ");
		 }
		 System.out.println("\n");
	 }
 }
  
 public int getposx(){
	 return posx;
 }
 public int getposy() {
	 return posy;
 }
 public Wheat[][] getFieldArray(){
	 return grainFeldArray;
 }
}
