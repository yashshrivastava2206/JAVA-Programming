package practice.march03;

import java.util.Scanner;

public class printNum1To10 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

    int [] marks = {1,3,5,7,8};
    for(int element: marks){
        System.out.println(element);
    }
        String [] name = {"Yash","Nishu","Sejal"};
        for(String element: name){
            System.out.println(element);
        }


        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        char []yash = new char[n];

        char [] yash = {'Y','A','S','H'};
        for(int i=0;i<yash.length;i++){
            System.out.println(yash[i]);
        }
        for(char element: yash){
            System.out.println(element);
        }
    }
}
