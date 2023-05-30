//This is for Array.sort()
import java.util.Arrays;

// For Scanner 
import java.util.Scanner;

public class App {

    //Method should be above main fuction
    public static void printJava(){
        System.out.println("Hello Java");
    }

    public static void printName(String name){
        System.out.println("Hello" +" "+ name);
    }

    public static int printSum(int a,int b){
        return a+b;
    }


    //This is the main function
    public static void main(String[] args){
        /* 
            First program
        */
        //No need for new lines with this
        // System.out.println("Hello Java");
        // System.out.println("Hell boss");

        //Variables

        // String name = "Aman";
        // String neighbour = "Akku";
        // int age = 30;
        // //Assigning values
        // String friend = neighbour;

        // Primitive data types 
        //byte - [-128 to 127]
        //short - 2
        //int -4
        //long -8 
        //float -4 3.14
        //double -8 
        //char - 2 a,b,c,d
        //boolean - 1 true/false

        // byte age = 30;
        // int phone = 1234567890;
        // //You have to add L to long characters
        // //so that java knows that you are adding long value 
        // long phone2 = 1234567890L;
        // float pi = 3.14F;
        // char letter = 'a';
        // boolean isAdult = true;


        //Non Primitive data type
        // -> String
        // String name = new String("Aman");
        // String friend = new String("Akku");
        // System.out.println(name.length());



        // String methods 
        //concatenate using + 
        // String name1 = "Aman";
        // String name2 = "Akku";
        // String name3= name1 + " and " + name2;
        // System.out.println(name3);

        // charAt(index) -> gives you the output of the value 
        // String name = "Aman";
        // System.out.println(name.charAt(1));

        //length
        // System.out.println(name.length());


        // replace 
        // String name = "Amaan";
        // String name2 = name.replace('a','b');
        // System.out.println(name2);
        

        //substring
        // String name = "Aman and akku";
        // System.out.println(name.substring(5, 9));

        //Arrays-> Non primitive data type

        //Declaring the array
        //If you dont initialize any value, by default it will give 0 or null
        // boolean[] marks = new boolean[3];  
        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 92;
        // marks[2] = 91;

        //length
        // System.out.println(marks.length); 

        //Sort -> In order to use this 
        //you need import java.util.arrays
        //gives out sorted value
        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);
        
        //1D Array if you know the elements
        // int [] marks = {97,98,99};

        // //2D Array
        // int[][] finalMarks = {{97,98,95},{95,95,98}};
        // System.out.println(finalMarks[1][0]);
        

        //Casting -> converting from one type to another type
        //Two types -> Implicit and explicit
        //Since double has 8 bytes and int has 4 bytes, it can implicitly convert the int to double
        //However for int to double its not possible to convert double to int because double is greater in size. Therefore explicit type casting is needed. 

        // double price = 100.00;
        // double final_price = price + 18;
        // System.out.println(final_price);
        

        // //Explicit casting
        // int p = 100;
        // int finalPrice2 = p + (int)18.0;
        // System.out.println(finalPrice2);


        //constants = so that value cannot be changed
        // int age= 30;
        // age =31;

        //This is how constants is declared in JAVA
        //THey are represented by uppercase
        // final float PI = 3.14F;


        // //Maths
        // System.out.println(Math.max(5,6));
        // System.out.println(Math.min(5,6));

        // //random 
        // //Type casted to int
        // System.out.println((int)(Math.random()*100));

        //How to take input an int 
        //Need import java.util.Scanner
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input your age: ");
        // //taking integer
        // int age = sc.nextInt();
        // System.out.println(age);
    
        //Float
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input your age: ");
        // float age = sc.nextFloat();
        // System.out.println(age);
    

        //String input only one word or without spaces
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input your name");
        // //This next only will take single input
        // String name = sc.next();
        // System.out.println(name);


        // // With spaces 
        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("Input your name");
        // String name2 = sc2.nextLine();
        // System.out.println(name2);


        //Comparison Operators
        // // > < >= <= == !=

        //Logical Opeators
        // && || !

        //Conditional Statements
        // Scanner sc = new Scanner(System.in);
        // int cash = sc.nextInt();

        // if(cash <10){
        //     System.out.println("Cannot buy anything");
        //     System.out.println("Get more cash");
        // }

        // else if(cash >10 && cash <50){
        //     System.out.println("Can get 1 thing");
        // }
        // else{
        //     System.out.println("can get both");
        // }


        //Same as other programmng languages
        //Loops 
        // for(int i=0; i<10; i++){
        //     System.out.println(i);
        // }

        //While loops
        // int i =100;
        // while(i>=1){
        //     System.out.println(i);
        //     i--;
        // }

        //Do while loops
        // int k = 100;
        // do{
        //     System.out.println(k);
        //     k=k-1;
        // }while(k <=1);

        //do while example
        // Scanner sc = new Scanner(System.in);
        // int number;
        // do{
        //     System.out.println("Input Number: ");
        //     number = sc.nextInt();
        //     //Gives the code in one line 
        //     System.out.print("Here is your number: ");
        //     System.out.println(number);

        // }while(number >=0);
        // System.out.println("THE END");

    
        //Break and continue 

        //Exceptional Handling
        // Try-catch 
        // int [] marks= {97,98,95};

        // try{
        //     System.out.println(marks[4]);
        // }
        // catch(Exception exception){
        //     //do something after catching
        //     System.out.println("Fix your array");
        // }
        // System.out.println("The studen is modhu");            
    
        // Methods -> class / Functions 


        //Function 
        // printJava(); 

        // printName("Aman"); 

        int sum = printSum(10,20);
        System.out.println(sum);
    
    }
}
