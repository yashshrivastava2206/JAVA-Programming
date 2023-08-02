import java.util.*;
import java.util.List;
import java.util.Scanner;

public class StringPermutation_Unique {
    public static void dfs(String str,String comb,List<String> list){
        if(str.length()==0){
            list.add(comb);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            String temp= str.substring(0,i)+str.substring(i+1);
            dfs(temp,comb+ch,list);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String :");
        String str= sc.nextLine();
        List<String> list = new ArrayList<String>();
        dfs(str,"",list);
        for(String s: list){
            System.out.println(s);
        }
    }
}
