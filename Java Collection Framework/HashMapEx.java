package JavaCollection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Integer> map= new HashMap<>();
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter Elements:");

        for(int i=0;i<size;i++){
            int num=sc.nextInt();
            map.put(num, map.getOrDefault(map.get(num),0)+1);
        }
        System.out.println(map);
        System.out.println(map.toString());
        String str1= "namooni smriti";
        String str2= new String("namooni smriti");
        String str3="Namooni Smriti";
        str3.toLowerCase();
        System.out.println(str3);
        if (str1==str2)
            System.out.println("Smriti is Cute namooni");
        else if(str1.equals(str3))
            System.out.println("She is still namooni");
        else
            System.out.println("She is bade wali namooni");
    }
}
