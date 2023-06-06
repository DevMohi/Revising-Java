//Tree (User recursion)
//Graphs (uses recursion)


//Print numbers from 5 to 1 
// public class recusrsion {
//     public static void printNumbers(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.println(n); //5 
//         printNumbers(n-1); // 4 3 2 1
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumbers(n);
//     }
// }

//1 to 5
// public class recusrsion {
//     public static void printNumbers(int n){
//         if(n == 6){
//             return;
//         }
//         System.out.println(n); //1 
//         printNumbers(n+1); // 2 3 4 5
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumbers(n);
//     }
// }

//Print sum of first n natural numbers

// public class recusrsion {
//     public static void sum(int i, int n, int sum){
//         if(i==n){
//             sum +=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         sum(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         sum(1,5,0);
//     } 
// }


//Print factorial of a number n 
// public class recusrsion {
    
//     public static int factorial(int n){

//         if(n==1 || n ==0){
//             return 1;
//         }
//         int factorial = factorial(n-1); //5 4 3 2 1
//         int fact = n*factorial; // 5* 4 
//         return fact;
        
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = factorial(5);
//         System.out.println(ans);
//     } 
// }


//Fibonacci series - Print fibonacci till nth term
// public class recusrsion {
    
//     public static void fibonacci(int a,int b,int n){
//         if(n == 0){
//             return;
//         }
//         int c = a+b;
//         //b hocce last term ar c hocce sum 
//         //0 1 1 2 3 5 8 
//         System.out.println(c);
//         fibonacci(b, c, n-1);
       
        
//     }
//     public static void main(String[] args) {
//         int a = 0 , b= 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         //coz first 2 is printed
//         fibonacci(a, b, n-2);

//     } 
// }


// //Print x*n (stack height  = n )
// public class recusrsion {
    
//     public static int calculatePow(int x,int n){
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }
//         int xPownm1 = calculatePow(x, n-1);
//         int xPown = x*xPownm1;
//         return xPown;
              
//     }
//     public static void main(String[] args) {
        
//         int x= 2 , n =5;
//         int ans = calculatePow(x, n);
//         System.out.println(ans);
//     } 
// }


//Print x*n (stack height  = logn )
public class recusrsion {
    
    public static int calculatePow(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        //if n is even

        if(n%2 == 0){
            return  calculatePow(x, n/2) * calculatePow(x, n/2);
        }
        else{ // n is odd
            return calculatePow(x, n/2) * calculatePow(x, n/2) * x;
        }
              
    }
    public static void main(String[] args) {
        
        int x= 2 , n =5;
        int ans = calculatePow(x, n);
        System.out.println(ans);
    } 
}

