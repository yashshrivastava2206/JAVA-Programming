/* Addition of elements of 1D array */

package practice.march03;

import java.util.Scanner;

public class SumArrayElement {
    public static void main(String[] args) {
        int []num = new int[5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<num.length;i++){
            num[i]= sc.nextInt();
        }
        for (int element : num){
            sum=sum+element;
        }
        System.out.println(sum);
    }
}
