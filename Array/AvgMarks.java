package practice.march05;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int [] phy = new int[size];
        System.out.println("Enter "+size+" elements :");
        for(int i=0;i<size;i++){
            phy[i]= sc.nextInt();
        }

        //Display and Calculation part
        int sum=0;
        System.out.println("Entered Elements are :");
        for(int i=0;i<size;i++){
            System.out.println(phy[i]);
            sum=sum+phy[i];
        }

        //Display Average
        float Avg = (float)(sum/size);
        System.out.println("Average :"+Avg);
    }
}
