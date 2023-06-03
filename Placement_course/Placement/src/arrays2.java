// //2D arrays
// import java.util.*;

// public class arrays2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int numbers[][] = new int[row][col];


//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 System.out.print(numbers[i][j]+ " ");
//             }
//             System.out.println();
//         }
        
    
//     }
// }
//2D arrays
// import java.util.*;

// public class arrays2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int numbers[][] = new int[row][col];


//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         int x;
//         x = sc.nextInt();
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(numbers[i][j] == x){
//                     System.out.print("X Found at" + " " + i + " " + j);
//                 }
   
//             }
//             System.out.println();
//         }
        
    
//     }
// }

import java.util.*;


public class arrays2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The Spiral Order Matrix is : ");
      int rowStart = 0;
      int rowEnd = n-1;
      int colStart = 0;
      int colEnd = m-1;


      //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;


          System.out.println();
      }
   }
}

