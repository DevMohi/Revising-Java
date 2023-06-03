// public class stringbuilder {
//     public static void main(String[] args) {
//         //String builder does every modify and everything which string cannot do

//         //Stringbuider is more optimized
//         String a = "Tony";
        
//         StringBuilder sb = new StringBuilder(a);
//         System.out.println(sb);

//         //CharAt
//         System.out.println(sb.charAt(0));

//         //setCharacter at index
//         //you cannot printline this method because it modifies the value
//         sb.setCharAt(0, 'h');
//         System.out.println("New String");
//         System.out.println(sb);

//         //Insert
//         sb.insert(2,'n');
//         System.out.println("New insert");
//         System.out.println(sb);
        
//         //Delete 
//         sb.delete(2, 3);
//         System.out.println("Deleted");
//         System.out.println(sb);

//         sb.setCharAt(0, 'T');
//         System.out.println(sb);

//         //Append
//         sb.append('e');
//         System.out.println("Appends at the end");
//         System.out.println(sb);

//         //length
//         System.out.println(sb.length());
//     }
// }
public class stringbuilder {
    public static void main(String[] args) {
        //Reverse a string

        // String reversed = "";

        // for(int i=0; i<name.length();i++){
        //     reversed = name.charAt(i) + reversed;
        // }
        // System.out.println(reversed);

        //Another way = reverse string
        StringBuilder name = new StringBuilder("hello");

        for(int i=0; i<name.length()/2 ;i++){
            int front = i;
            int back = name.length() -1 -i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);


            // setCharAt(index, char) 
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);
        }
        System.out.println(name);
    
    }

}
