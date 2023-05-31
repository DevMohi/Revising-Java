//nested loops
// public class pattern {
//     public static void main(String[] args) {
//         // outer loop 
//         for(int i=1; i<=4;i++){
//             //inner loop
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             // System.out.print("\n");
//             System.out.println();
//         }
//     }
// }

//Hollow Rectangle

// public class pattern {
//     public static void main(String[] args) {
//         int n =4;
//         int m = 5;

//         // outer loop 
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=m;j++){
//                 //cell -> (i,j);
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.println(" ");
//                 }
//             }
//             System.out.println();
            
//         }
//     }
// }


//Inverted Half pyramid 

// public class pattern {
//     public static void main(String[] args) {
//         int n =4;
//         int m = 5;

//         // outer loop 
//         for(int i=n; i>=1;i--){
//             //i er jei value cholbe oi hishebe run hobe
//             //corrsponsds to row
//             for(int j=i; j>=1;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//     }
// }

//Inverted half pyramid

// public class pattern {
//    public static void main(String args[]) {
//        int n = 4;
      
//        for(int i=n; i>=1; i--) {
        
//            for(int j=1; j<i; j++) {
//                System.out.print(" ");
//            }


//            for(int j=0; j<=n-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
// }


//Half pyramid with numbers

// public class pattern {
//    public static void main(String args[]) {
//        int n = 5;
      
//        for(int i=1; i<=n; i++){
//             //Kaj
//             for(int j=1; j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//        }
//    }
// }
//Inverted half pyramid with numbers 
// public class pattern {
//    public static void main(String args[]) {
//        int n = 5;
//        for(int i=1; i<=n; i++){
//             //Kaj
//             //1 to 5
//             //
//             for(int j=1; j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//        }
//    }
// }

//Floyds triangle
// public class pattern {
//    public static void main(String args[]) {
//        int n = 5;
//        int k = 1;
//        for(int i=1; i<=n; i++){
//             //Kaj
//             //1 to 5
//             //
//             for(int j=1; j<=i;j++){
//                 System.out.print(k+" ");
//                 k++;
//             }
//             System.out.println();
//        }
//    }
// }

// 0-1 triangle 

// public class pattern {
//    public static void main(String args[]) {
//        int n = 5;

//        for(int i=1; i<=n; i++){
//             for(int j=1; j<=i;j++){
//                 if((i+j) %2 ==0 ){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//        }
//    }
// }



//Solid rhombus

// public class pattern {
//    public static void main(String args[]) {
//       int n =5;
//       int space = n-1;

//       for(int i=1; i<=n;i++){
//         //for space 
//         for(int j=1; j<=space; j++){
//             System.out.print(" ");
//         }
//         //for star
//         for(int j=1; j<=n;j++){
//             System.out.print("*");
//         }
//         space--;
//         System.out.println();
//       }
      
//    }
// }


//Print a number pyramid

// public class pattern{
//     public static void main(String[] args) {
//         int n =5;
        
//         for(int i=1; i<=n;i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
        
//             System.out.println();
//         }
//     }
// }



// ///Butterfly pattern

// public class pattern{
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             space = space - 2;
//             System.out.println();
//         }
//         //Second part
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             space = space - 2;
//             System.out.println();
//         }



//     }
// }

//Palindromic Pattern

// public class pattern{
//     public static void main(String[] args) {
//         int n =5;
//         for(int i=1; i<=n;i++){
//             //Spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // 1st half numbers  
//             for(int j=i;j>=1;j--){
//                 System.out.print(j+" ");
//             }

//             for(int j=2; j<=i; j++){
//                 System.out.print(j+" ");
//             }
         
//             System.out.println();
//         }
//     }
// }


//Advanced pattern

// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//         // 1st part 
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i;j++){
//                 if(i==j || j==1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++){
//                 if(i==j || j==1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//         // 2nd part 
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i;j++){
//                 if(i==j || j==1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             int space = 2*(n-i);
//             for(int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i;j++){
//                 if(i==j || j==1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }


//Hollow rhombus

public class pattern {
   public static void main(String args[]) {
      int n =5;
      int space = n-1;
    
      for(int i=1; i<=n;i++){
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        space--;
        System.out.println();

      }
      
   }
}
