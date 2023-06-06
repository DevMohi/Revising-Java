// //Tower of Hanoi - Intermediate 
// //rules 
// //Only One disk transerred in 1 step
// // Smaller disks are always kept on top of larger disks


// public class recursion2 {
//     public static void tower(int n , String src, String helper, String dest){

//         if(n==1){
//             System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
//             return;
//         }

//         tower(n-1, src,dest,helper);
//         System.out.println("transfer disk "+ n + " from " + src + " to " + dest);

//         tower(n-1, helper,src,dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         tower(n, "S","H","D");

//     }
// }


//Print string in reverse
//"abcd"

// public class recursion2 {
//     public static void reverse(String str,int index){
//         if(index == 0){
//             return;
//         }
//         System.out.println(str.charAt(index));
//         reverse(str, index-1);
//     }
    
//     public static void main(String[] args) {
//         String str = "abcd";
//         reverse(str, str.length()-1);
//     }
// }


//Find the first and last occurence in a string

// public class recursion2{

//     public static int first = -1;
//     public static int last = -1; 

//     public static void findoccurence(String str,int index, char element){
//         //traverse through element
//         if(index == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(index);
//         if(currChar == element){
//             if(first == -1){
//                 first= index;
//             }
//             else{
//                 last = index;
//             }
//         }
//         findoccurence(str, index+1, element);
//     }

//     public static void main(String[] args) {
//         String str ="baaacdaefaah";
//         findoccurence(str, 0, 'a');   
//     }
// }



//Check if an array is sorted ascending way 
// ans correct -> 1 2 3 4 5 
// not correct -> 1 2 3 4 4 


// public class recursion2{

//     public static boolean isSorted(int arr[], int index){

//         if(index == arr.length -1 ){
//             return true;
//         }

//         if(arr[index] < arr[index+1]){
//             //array is sorted
//             return isSorted(arr, index+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//          int arr[] = {10,50,40,50};
//          System.out.println(isSorted(arr, 0));
//     }
// }



//Move all x to the end of the string
// "axbcxxd" -> "abcdxxxxx"
// public class recursion2{

//     public static void moveAllx(String str, int index,int count, String newString){
        
//         if(index == str.length()){
//             for(int i=0; i<count; i++){
//                newString+='x';
//             }
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(index);
//         if(currChar == 'x'){
//             count++;
//             moveAllx(str, index+1, count, newString);
//         }
//         else{
//             newString = newString + currChar;
//             moveAllx(str, index+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//          String str = "axbcxxd";
//          moveAllx(str, 0, 0, "");
//     }
// }

//Remove duplicates in a string 
//"abbccda" => abcd

// public class recursion2{
//     public static boolean [] map = new boolean[26];


//     public static void removeDuplicates(String str, int index,String newString){
//         if(index == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(index);
//         if(map[currChar - 'a'] == true){
//             removeDuplicates(str, index+1, newString);
//         }
//         else{
//             newString+=currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str,index + 1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str="abbcdaaa";
//         removeDuplicates(str, 0, "");
//     }
// }


//Important 
// Print all the subsequences of a string 
//-> abc,ab,bc,ac,a,b,c

import java.util.HashSet;

public class recursion2{
   public static void subsequences(String str, int index, String newString, HashSet<String> set){

    if(index == str.length()){
        if(set.contains(newString)){
            return;
        }else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
    }
    char currChar = str.charAt(index);
    subsequences(str, index+1, newString+currChar,set);

    subsequences(str, index+1, newString,set);
   }



    public static void main(String[] args) {
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        subsequences(str, 0,"", set);
    }   
}

