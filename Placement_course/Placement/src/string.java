// // import java.util.Scanner;

// // public class string {
// //     public static void main(String[] args) {
// //         //String Declaration
// //         String s = "Hello World";

// //         String fullName = "Tony bhaui";

// //         String sentence=  "Sahking is best";

// //         //getting input

// //         Scanner sc = new Scanner(System.in);
// //         String name = sc.nextLine();
// //         System.out.println(name);
// //     }
// // }

// //String functions 
// import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//        //Concatenation
//        String firstName = "farhan";
//        String secondName = "mollah";
//        System.out.println(firstName + " " + secondName);

//         // length 
//         System.out.println(firstName.length());

//         //charAt -> aita shob split kore dibe
//         // e.g farhan -> f a r h a n 

//         for(int i=0; i<firstName.length(); i++){
//             System.out.println(firstName.charAt(i));
//         }

//         //compare two strings
//         //Compares lexigraphically
//         String name1 = "Tony";
//         String name2 = "Tony";

//         //s1 > s2  = +ve;
//         //s1 == s2 = 0
//         //s1<s2 = -ve

//         if(name1.compareTo(name2) == 0){
//             System.out.println("strings are equal");
//         }
//         else{
//             System.out.println("Not equal");
//         }

//         //Directly string compare
//         //Dont use this // gives wrong ans
//         if(name1 == name2){
//             System.out.println("Strings are equal");
//         }

//         if(new String("Tony") == new String("Tony")){
//             System.out.println("String are equal");
//         }
//         else{
//             System.out.println("Not equal");
//         }

//         //Substring
//         String sentence = "My name is Tony";
        
//         String name = sentence.substring(0, sentence.length());
//         System.out.println(name);

//         //Strings are immutable 
//         //you cannot modify, add or delete anything from here. 

//         if(name1.equals(name2)) {
//             System.out.println("They are the same string");
//         } else {
//             System.out.println("They are different strings");
//         }


//         String str = "123";
//         int number = Integer.parseInt(str);
//         System.out.println(number);

//         String numberString = Integer.toString((number));
//         System.out.println(numberString);
 
//     }
// }

// import java.util.*;

// public class string{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String orignal = sc.nextLine();

//         String result ="";

//         for(int i=0; i<orignal.length();i++){
//             if(orignal.charAt(i) == 'e'){
//                 result +='i';
//             }
//             else{
//                 result+= orignal.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }

import java.util.*;

public class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String result ="";

        for(int i=0; i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                result+=email.charAt(i);
            }
        }
        System.out.println(result);
    }
}