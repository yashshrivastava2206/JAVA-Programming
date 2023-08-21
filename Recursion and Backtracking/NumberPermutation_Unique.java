import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberPermutation_Unique {
    public static void permutation(int[] nums,List<List<Integer>> list,List<Integer> temp){
        if(nums.length==temp.size()){
            list.add(new ArrayList<>(temp));
            return ;
        }
        for (int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;;
            temp.add(nums[i]);
            permutation(nums,list,temp);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;
            System.out.println("Enter size of array");
            size= sc.nextInt();

        int[] nums= new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
                nums[i]=sc.nextInt();
        }
        List<List<Integer>> list =new ArrayList<>();
        permutation(nums,list,new ArrayList<Integer>());
        for(List<Integer> i: list){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
