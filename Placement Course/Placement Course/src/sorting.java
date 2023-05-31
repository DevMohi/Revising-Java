public class sorting {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};



        //selection sort
        //Time complexity -> O (n*2)
        // for(int i=0; i<arr.length-1 ; i++){
            //     for(int j=i+1; j<arr.length;j++){
                //         if(arr[i] > arr[j]){
                    //             //swap
                    //             int temp = arr[i];
                    //             arr[i] = arr[j];
                    //             arr[j] = temp;
                    //         }
                    //     }
                    // }
            // } 
                    
        //bubble sort
        //Time complexity = 0(n*2);
        //youtube method
        // for(int i=0; i<arr.length-1 ; i++){
        //     for(int j=0; j<arr.length-i-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        
        //Insertion sort
        for(int i =1; i<arr.length; i++){
            int current = arr[i]; //ar[1]
            int j = i-1; //0
            while(j>=0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        } 

        printArray(arr); 
    }
}
