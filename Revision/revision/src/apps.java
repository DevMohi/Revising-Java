public class apps {
    public static void main(String[] args) {
         // Reverse the string
         String str = "111222888222555";
         StringBuilder reversedStr = new StringBuilder(str).reverse();

         
 
         // Replace the last occurrence of "222" with "aaa"
         reversedStr.replace(reversedStr.lastIndexOf("222"), reversedStr.lastIndexOf("222") + 3, "aaa");
         System.out.println(reversedStr);
    }
}
