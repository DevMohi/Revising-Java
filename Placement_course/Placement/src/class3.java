//topics -> Conditional statements

// import java.util.*;

// public class class3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();

//         if(a ==b){
//             System.out.println("equal");
//         }
//         else if(a>b){
//             System.out.println("a is greater");
//         }
//         else{
//             System.out.println("a is leser");
//         }
//     }
// }


//Switch case
// import java.util.*;

// public class class3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
       
//         switch(button){
//             case 1: System.out.println("Hello");
//             break;
//             case 2: System.out.println("Salam");
//             break;
//             case 3: System.out.println("Bonjour");
//             break;
//             default: System.out.println("Nothing");
//         }
//     }
// }

//Homework


import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the numbers from the user
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Read the operation from the user
        System.out.println("Select an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");
        System.out.print("Enter the operation: ");
        int operation = scanner.nextInt();

        // Perform the calculation based on the operation
        double result;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case 5:
                result = a % b;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error: Invalid operation!");
        }
    }
}







