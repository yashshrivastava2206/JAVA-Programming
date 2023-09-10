package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("My ");
//        list.add("Name ");
//        list.add("Is ");
//        list.add("Yash ");
//        list.add("Shrivastava ");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
//        System.out.println(list);
//        list.set(3,"Nishu ");
//        System.out.println(list);
//        Iterator itr= list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(list.size());

        HashMap<String,String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//        capitalCities.get("England");
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}
