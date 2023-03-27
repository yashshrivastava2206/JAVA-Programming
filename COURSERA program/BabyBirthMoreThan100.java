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