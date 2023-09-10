// package Data_structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> shoppingList= new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("peer");
        shoppingList.add("grapes");
        shoppingList.add("kiwi");
        System.out.println(shoppingList);

        //Print size of Linked List by size() method
        System.out.println("size() : "+shoppingList.size());

        //Add element at specific location
        shoppingList.add(2,"mango");    //Add at position 2
        System.out.println("add(index,element) : "+shoppingList);



        //removing first element by removeFirst() method
        shoppingList.removeFirst();
        System.out.println("removeFirst() : "+shoppingList);


        //removing last element by removeLast() method
        shoppingList.removeLast();
        System.out.println("removeLast() : "+shoppingList);


        //add first element by addFirst() method
        shoppingList.addFirst("kiwi");
        System.out.println("addFirst() :"+shoppingList);


        //add last element by addLast() method
        shoppingList.addLast("apple");
        System.out.println("addlast() : "+shoppingList);

        //removing element at particular index by remove() method
        //remove() without argument removes first element
        shoppingList.remove(1);
        System.out.println("remove(index) : "+shoppingList);

        //remove element by its value
        shoppingList.remove(String.valueOf("grapes"));
        System.out.println("remove(<type>.valueOf(element)) : "+shoppingList);

        System.out.println("Synchronized LinkedList");
        List<String> synchronizedShoppingList =Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);


    }
}
