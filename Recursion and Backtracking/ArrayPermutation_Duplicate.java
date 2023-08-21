import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ArrayPermutation_Duplicate {
    static void dfs(List<List<Integer>> list,HashMap<Integer,Integer> map,List<Integer> perm,int size){
        if(perm.size()==size){
            list.add(new ArrayList<>(perm));
        }
        for(Integer key: map.keySet()){
            if(map.get(key)>0){
                perm.add(key);
                map.put(key, map.get(key)-1);
                dfs(list,map,perm,size);
                perm.remove(perm.size()-1);
                map.put(key, map.get(key) +1);
            }
        }
    }
    public static List<List<Integer>> permutationUnique(int[] nums){
    List<List<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        dfs(list,map,new ArrayList<>(),nums.length);
        return list;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("Enter Elements:");
        for(int i=0;i<size;i++){
            num[i]= sc.nextInt();
        }
        List<List<Integer>> list=new ArrayList<>();
        list=permutationUnique(num);
        System.out.println(list);
    }
}
