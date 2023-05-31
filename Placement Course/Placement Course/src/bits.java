//Example of get bit
// public class bits {
//     public static void main(String[] args) {
//         int n = 5; //0101
//         int pos = 3;
//         int bitmask = 1<<pos;

//         if((bitmask & n) == 0){
//             System.out.println("Bit was zero");
//         }
//         else{
//             System.out.println("Bit was one");
//         }
//     }
// }

//Example of set bit
// public class bits {
//     public static void main(String[] args) {
//         int n = 5; //0101
//         int pos = 1;
//         int bitmask = 1<<pos;

//         int newNumber = bitmask | n;
//         System.out.println(newNumber);

//     }
// }



//Example of clear bit

public class bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;

        int notBitmMask = ~(bitmask);

        int newNumber = notBitmMask & n;
        System.out.println(newNumber);

    }
}