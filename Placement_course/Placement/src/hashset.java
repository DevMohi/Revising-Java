import java.util.*;
public class hashset {
    public static void main(String[] args) {
        //Create
        HashSet<Integer> set = new HashSet<>();

        //Insert 
        //doesnt print duplicates
        set.add(1);
        set.add(2);
        set.add(3);


        //Search contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contains 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain");
        }

        //size
        System.out.println(set.size());
        

        //Printall
        System.out.println(set);

        //iterator needs an import import java.uti;.Iterator 

        Iterator it = set.iterator();
        //has next : next => 1,2,3
        // it.hasNext() -> returns true or false , checks till last item 
        while(it.hasNext()){
            System.out.println(it.next());
        }
        


    }
}
