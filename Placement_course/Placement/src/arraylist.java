//You can use this import or
import java.util.*;

// import java.util.Collections; 
//import java.utul.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList <String> names = new ArrayList<String>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(1);
        System.out.println(list);


        //get elements 
        int elements = list.get(0);


        //add element in between 
        list.add(1,10);
        System.out.println(list);

        // set element 
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+ " " + "each element ");
        // }

        //sorting //ascending order
        Collections.sort(list);
        System.out.println(list);

    }
}
