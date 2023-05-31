import java.util.*;

public class str {
    public static void main(String[] args) {
        //Compare Strings
        // String name1 = "Tony";
        // String name2 = "Tony";

        //1 s1>s2 = +ve value
        //2 s1 == s2 : 0
        // s1<s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        //substring -> Getting a part of sentence
        String sentence = "My name is Tony";
        String name = sentence.substring(11, 13);
        System.out.println(name);
    }

}
