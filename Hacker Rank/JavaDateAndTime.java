import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
     
     public static int yearDays(int year){
         int count=0;
         for(int i=2001;i<year;i++){
             if(i%400==0) ++count;
             else if(i%100 != 0 && i%4==0) ++count;
         }
         System.out.println((year-2001)*365+count);
         return (year-2001)*365+count;
     }
     public static int monthDays(int month,int year){
         int day = 31;
         if(month==1){ 
             day=0;
         }
         else{
         for(int i=2;i<=7 && i<month;i++){
             if(i%2==0) day+=30;
             else day+=31;
         }
         for(int i=8;i<=12 && i<month;i++){
             if(i%2==0) day+=31;
             else day+=30;
         }
         if(year%400==0 && month>2) day-=1;
         else if(year%4==0 && year%100!=0 && month>2) day=day-1;
         else if(month>2) day-=2;
         
         }
         System.out.println(day);
         return day;
     }
    public static String findDay(int month, int day, int year) {
        int Day ;
        Day= yearDays(year)+monthDays(month,year)+day;
        System.out.println(day);
        switch(Day%7){
            case 0:
            return "SUNDAY";
            
            case 1:
            return "MONDAY";
            
            case 2:
            return "TUESDAY";
            
            case 3:
            return "WEDNESDAY";
            
            case 4:
            return "THURSDAY";
            
            case 5:
            return "FRIDAY";
            
            case 6:
            return "SATURDAY";
            
        }
        return "No";
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
