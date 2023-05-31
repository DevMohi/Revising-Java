public class stringbuild {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

    
        //reverse a string
        for(int i=0; i<sb.length()/2;i++){
            int front =i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }

        System.out.println(sb);


        // System.out.println(sb);

        // //char ar index 0
        // System.out.println(sb.charAt(0));

        // //set char ar index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // //insert charAt at any index
        // sb.insert(0,"S");
        // System.out.println(sb);

        // //delete a substring;// this will go till 2 and not 3
        // sb.delete(2, 3);
        // System.out.println(sb);

    }
}
