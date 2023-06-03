// import java.util.*;

// public class arrays {
//     public static void main(String[] args) {
//         // Array = Same data type in a list 
        
//         //Array defined 
//         // type [] arrayName = new type [size];
    
//         int [] marks = new int [3];
        
//         //Takina array input with for loop
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<3; i++){
//            marks[i] = sc.nextInt();
//         }

//         for(int i=0; i<3;i++){
//             System.out.println(marks[i]);
//         }
//         //Another way

//         int [] marks2 = {10,20,30,40};
//     }
// }

// import java.util.*;

// public class arrays {
//     public static void main(String[] args) {
//         int size;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Print the size: ");
//         size = sc.nextInt();

//         System.out.println("Print the arrays: ");
//         int [] numbers = new int [size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         int x;
//         System.out.println("Print the x: ");
//         x = sc.nextInt();
        
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == x){
//                 System.out.println("Index" + " " + i);
//             }
//         }

//     }
// }


// import java.util.*;

// public class arrays {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();

//       sc.nextLine(); // consume the newline character // because it takes enter ase input
//       String names[] = new String[size];


//       //input
//       for(int i=0; i<size; i++) {
//           names[i] = sc.nextLine();
//       }
     
//       //output
//        for(int i=0; i<names.length; i++) {
//            System.out.println("name " + (i+1) +" is : " + names[i]);
//        }
      
//    }
// }


// import java.util.*;


// public class arrays {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       int numbers[] = new int[size];


//       //input
//       for(int i=0; i<size; i++) {
//           numbers[i] = sc.nextInt();
//       }


//       int max = Integer.MIN_VALUE;
//       int min = Integer.MAX_VALUE;
     
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }


//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
      
//    }
// }

import java.util.*;


public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      boolean isAscending = true;
     
       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }

       //ParseInt method
       
      
   }
}
