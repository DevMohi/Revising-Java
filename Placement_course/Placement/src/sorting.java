//Three types of sort
// 1) Bubbbe sort
// 2) Insertion sort
// 3) Selection sort


// 1 -> Bubble sort, shob theke heavy element last e push kore  
// public class sorting {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length; i++){
//             System.out.print(arr[i] + " "); 
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr [] = {7,8,3,1,2};

//         //Time Complexity - O(n*2);
//         //5-1-0 = 4 ,3, 2,1,0
//         //bubble sort
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1; j++){
//                 // System.out.print(arr[j] +" "+ arr[j+1]+ " ");
//                 if(arr[j] > arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     // System.out.println(arr[i] + " " + arr[j]+ " ");
//                 }

//             }
            
//         }

//         // printArray(arr); 
//     }

// }

//Selection Sort
//Time complexity 0(n*2)

// public class sorting {
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length; i++){
//             System.out.print(arr[i] + " "); 
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr [] = {7,8,3,1,2};

//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
                
//                 if(arr[smallest] > arr[j]){
//                     // one swap only
//                     smallest = j;    
//                 }
//                 // System.out.println(arr[i] + " " + arr[j] + " " + arr[smallest]); 
//             }
//             // System.out.println("This is smallest" + arr[smallest]);
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         // printArray(arr); 
//     }

// }

//Insertion Sort


public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {7,8,3,1,2};

        //Insertion sort

        //First er ta sorted dhori amra
        // so 1 to 5 
        for(int i=1; i<arr.length; i++){
            int current = arr[i]; // 8 3 1 2
            // System.out.print(current + " ");
            int j = i -1; // 0 1 2 3
            // System.out.print(j+" "); 

            while(j>=0 && arr[j]> current){
                System.out.println(arr[j] + " " + current);
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
        // printArray(arr);    
    }

}