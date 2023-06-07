import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();


        //Insertion 
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 10);
    
        System.out.println(map);

        //Put 
        map.put("China",180);
        System.out.println(map);


        //Search  by keys
        if(map.containsKey("China")){
            System.out.println("Exists");
        }

        //To get the values by keys
        System.out.println(map.get("China"));
        //if the value doesnt exist it will print null
        System.out.println(map.get("Indonesia"));

        //Iterate
        //This wont give u index
        // int arr [] = {12,15,10};
        // for(int val : arr){
        //     System.out.println(val);
        // }


        //Iterate
        //This doesnt return index

        //One way
        // for(Map.Entry<String,Integer> e: map.entrySet()){
        //     System.out.println("Map");
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }


        //2nd way
        Set <String> keys = map.keySet();
        for(String key: keys){
            System.out.println("With key");
            System.out.println(key + " " + map.get(key));
        }

        //remove pair

        map.remove("China");
        System.out.println(map);

    }
}
