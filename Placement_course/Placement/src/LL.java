//Linked List Collection Framework

import java.util.*;
public class LL{
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);



        //add and addlast same
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0 ; i<list.size(); i++){
            if(list.get(i)  == "This"){
                System.out.println("Yes");
            }
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.print("null");
        System.out.println();

        //delete first and delete last

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        // delete by index
        list.remove(3);
        System.out.println(list);


        
    }
}