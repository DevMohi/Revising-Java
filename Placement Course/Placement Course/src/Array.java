import java.util.*;
public class Array {
    public static void main(String[] args) throws Exception {
        //One way
        // int marks [] = new int[3];

        // marks[0] = 97;
        // marks[1] = 95;
        // marks[2] = 96;

        // //second way
        // int marks2 []= {10,20,30}; 

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }


        //taking inputs from user
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int numbers [] = new int[size]; 

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //linear search 
        for(int i=0; i<size; i++){
            if(numbers[i] == x){
                System.out.println(i);
            }
        }

    }
}
