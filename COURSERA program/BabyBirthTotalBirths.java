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
for(CSVRecord rec : fr.getCSVParser(false)) {
	int numBorn = Integer.parseInt(rec.get(2));
	totalBirths += numBorn ;
            }
            System.out.println("total births = " + totalBirths);
    }
public void testTotalBirth() {
         FileResourse fr = new FileResourse("data/example-small"); //Provide data path here
         totalBirth(fr);
   }