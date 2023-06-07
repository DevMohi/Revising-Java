import java.util.*;
public class assesment {
    public static void main(String[] args) {

        String array[] = {"Honda", "Toyota", "Proton"};
        ArrayList <String> arrayA = new ArrayList<>(Arrays.asList(array));

        System.out.println(arrayA);
        arrayA.add("Nissan");
        System.out.println(arrayA);

        arrayA.add(0,"Mazda");
        System.out.println(arrayA);

        
        String animals[] = {"Monkey", "Donkey"};
        ArrayList <String> arrayB = new ArrayList<>(Arrays.asList(animals));
        System.out.println(arrayB); 

        //Combining arrays
        arrayA.addAll(arrayB);
        System.out.println(arrayA);

        //Hashmap

        HashMap<String, String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        HashMap<String,String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        mapC.putAll(mapD);
        System.out.println(mapC);

        //Hashmaps only keeps unique keys in their sets. 

        Set <String> keys = mapC.keySet();
        for(String key : keys){
            // System.out.println(key + " " + mapC.get(key)); 
            if(mapC.containsKey("5")){
                System.out.println(mapC.get(keys));
            }
        }


        //One way 
        // for(Map.Entry<String,String> e: mapC.entrySet()){
        //    if(e.getKey().contains("5")){
        //     System.out.println(e.getValue());
        //    }
        // }


        //Another way 
        mapC.forEach((key,value)-> {
            if(key.contains("5")){
                System.out.println(key + " " +  value);
            }
        });

        System.out.println("Done");


        List<String> keysToRemove = new ArrayList<>();
        mapC.forEach((key,value) -> {
            if(value.contains("o")){
                keysToRemove.add(key);
            }
        });

        // System.out.println(keysToRemove); 


        // keysToRemove.forEach(key -> mapC.remove(key));
        // System.out.println(mapC);
        

        String str = "111222888222555";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        str = reversedStr;

                // Replace the last occurrence of "222" with "aaa"
        int lastIndex = str.lastIndexOf("222");
                if (lastIndex != -1) {
                    str = str.substring(0, lastIndex) + "aaa" + str.substring(lastIndex + 3);
                }
                System.out.println("String after replacing the last occurrence of '222' with 'aaa': " + str);
   
    }
}
