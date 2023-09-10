package JavaCollection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int temp= list.get(1);
        list.set(1,list.get(2));
        list.set(2,temp);
        list.add(2,7);
        System.out.println(list);
    }
}
