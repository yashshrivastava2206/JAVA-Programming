import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] arr= new int[10];
        System.out.println("Enter 10 numbers in an array :");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],secLarge=0;
        for(int element : arr){
            if(element>max){
                secLarge=max;
                max=element;
            }
            else if(element<max && element>secLarge){
                secLarge=element;
            }
        }
        System.out.println("Second Largest Element is :"+secLarge);
    }
}
