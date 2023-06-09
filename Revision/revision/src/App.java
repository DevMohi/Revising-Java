//Java Collection Frameworks 
import java.util.*;
public class App {
    public static void main(String[] args) {
        //ArrayList

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(10);

        // list2.add(1,30);
        // System.out.println(list2);

        //LinkedList
        LinkedList <Integer> t = new LinkedList<>();
        t.add(10);
        t.add(20);
        t.remove(1);

        //Vector 
        Vector <Integer> vector = new Vector<>();
        vector.add(5);
        vector.clear(); //clears the vector 

        //Stack -> last in first out
         Stack <Integer> stack = new Stack<>();
         //Push, pop peek
        //  stack.push(10);
        //  stack.push(20);
        //  stack.push(20);
        //  stack.push(20);
        //  stack.push(20);
        //  stack.push(30);
        //  stack.push(40);
        //  stack.pop();
         
        // System.out.println(stack);
        // System.out.println(stack.peek());

        //Set -> Unordered Collection , Onky Stores unique values
        // -> HashSet, LinkedHashSet 
        //Gives an unordered list hashset
        //Only stores unique value 
            // HashSet <Integer> set = new HashSet<>();
            // set.add(10);
            // set.add(20);
            // set.add(30);
            // set.add(30);
            // System.out.println(set);


        //Linkedhashset
        //Ordered but doesnt repeat duplicate values. 
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        boolean bl = linkedHashSet.contains(20); //Returns true or false 
        // System.out.println(bl); 
        // System.out.println(linkedHashSet); 


        //Treeset -> gives sorted value and doesnt give duplicate value
        TreeSet <Integer > asc = new TreeSet<>();
        asc.add(10);
        asc.add(1);
        asc.add(2);
        asc.add(3);
        asc.add(11);
        // System.out.println(asc); 

        // Queue -> First in first out 
        //Front 
        //Rear
        //add -> offer() in queue
        //poll() -> remove 
        //add can throw exception in queue. 
        Queue <Integer > queue = new LinkedList<>();
        queue.add(10);
        queue.offer(200);
        queue.add(30);
        queue.offer(40);

        queue.remove();
        queue.poll();
        // System.out.println(queue);

        //ArrayDeQueue
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        adq.offerFirst(40);

        //40 10 20 30
        // System.out.println(adq);

        //Map -> key unique, value can be duplicated 
        //HashMap
        //TreeMap 

        HashMap<String , Integer > map = new HashMap<>();
        map.put("Second",20);
        map.put("Secon",30);
        // System.out.println(map); 

        //Treemap -> gives sorted value by keys 

        TreeMap <String, Integer >  map2 = new TreeMap<>();
        map2.put("Second",20);
        map2.put("Secon",30);

        // System.out.println(map2); 

        //Getting all the keys
        // System.out.println(map2.keySet()); 
        // System.out.println(map2.values()); 


        //Examples 

        //Sorted array 
        int arr[] = {1,20,3,40,5,6,7,7};
        for(int e : arr){
            Arrays.sort(arr);
            System.out.println(e);
            //Binary Search returns from a sorted array 
            System.out.println(Arrays.binarySearch(arr, 40));
        }

        //Element find





        

       


    }
}
