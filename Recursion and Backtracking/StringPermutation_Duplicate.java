import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringPermutation_Duplicate {
    public static void permutation(String str, String res,List<String> list,Set<Character> set){
        if(str.length()==0) {
            if(!list.contains(res)){
                list.add(res);
            }
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String temp= str.substring(0,i)+str.substring(i+1);
            permutation(temp,res+ch,list,set);
        }
    }
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str= br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> list= new ArrayList<>();
        permutation(str,"",list,new HashSet<Character>());
        for(String s: list){
            System.out.println(s);
        }
    }
}
