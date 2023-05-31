public class functions {

    public static void printMyName(String name){
        System.out.println("My name is: " + name);
    }

    public static int addSum(int a, int b){
        return a+b;
    }

    //always should be above main function
    public static void main(String[] args) {
        //void means no return

        int sum = addSum(10, 20);
        System.out.println(sum);
    }
}
