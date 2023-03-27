import edu.duke.*;
import org.apache.commons.csv.*;


public class BabyBirths {
         public void printNames() {
	     FileResource fr = new FileResoursee();
	     for (CSVRecord rec : fr.getCSVParser(false)) {
		    int numBorn =Integer.parseInt(rec.get(2));
		    if(numBorn<=100) {
		    System.out.println("Name :" +rec.get(0) +
				  " Gender :"+rec.get(1) +
				  " Num Born :" +rec.get(2));
		}
	         }
	}
         }
public void totalBirths (FileResourse fr) {
             int totalBirths = 0;
             int totalBoys = 0;
             int totalGirls =0 ;
for(CSVRecord rec : fr.getCSVParser(false)) {
	int numBorn = Integer.parseInt(rec.get(2));
	totalBirths += numBorn ;
	if(rec.get(1).equals("M")) {
	        totalBoys+=numBorn;
	   }
            else {
	    totalgirls+=numBorn;
	}
            }
            System.out.println("total births = " + totalBirths);
            System.out.println("total Boys = " + totalBoys);
            System.out.println("total Girls = " + totalGirls);
    }
public void testTotalBirth() {
         FileResourse fr = new FileResourse("data/example-small"); //Provide data path here
         totalBirth(fr);
   }