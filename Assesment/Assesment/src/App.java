import java.util.*;

public class App {
    public static void main(String[] args) {
     
        String[] arrayA = {"Honda","Toyota","Proton"}; 


        //Adding nissan
        //converting it to arrayList
        ArrayList<String> listA = new ArrayList<>(Arrays.asList(arrayA));
        // System.out.println(listA.get(0)); 

        //Added nissan to the arrayList
        listA.add("Nissan");
        System.out.println(listA);

        //Adding mazda as firstArrary
        listA.add(0,"mazda");
        System.out.println(listA);
        
        //Making variable Array B

        String[] arrayB = {"Monkey", "Tiger", "Lion"};

        //Converting it to arrayList

        ArrayList<String> listB = new ArrayList <>(Arrays.asList(arrayB));
        System.out.println("This is array b");
        System.out.println(listB);
       
       
        // combining  
        System.out.println("After combining");
        listA.addAll(listB);
        System.out.println(listA);

        Map <String,String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        Map<String,String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        //Combining them into one variable
        mapC.putAll(mapD);

        System.out.println("After combining maps");
        System.out.println(mapC);

        System.out.println("The reason is that the key '123' is common in both maps, and mapD overwrites the value.");


        //key value forEach loop
        mapC.forEach((key, value) -> {
            if (key.contains("5")) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
        });


        List<String> keysToRemove = new ArrayList<>();
        mapC.forEach((key, value) -> {
            if (value.toLowerCase().contains("o")) {
                keysToRemove.add(key);
            }
        });
    
        keysToRemove.forEach(key -> mapC.remove(key));
        System.out.println("Map C after removing entries with 'o' in the value (ignore case): " + mapC);

        String str = "111222888222555";

        // Reverse the string
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        str = reversedStr;
        System.out.println("Reversed String: " + str);

        // Replace the last occurrence of "222" with "aaa"
        int lastIndex = str.lastIndexOf("222");
        if (lastIndex != -1) {
            str = str.substring(0, lastIndex) + "aaa" + str.substring(lastIndex + 3);
        }
        System.out.println("String after replacing the last occurrence of '222' with 'aaa': " + str);
    }
}
