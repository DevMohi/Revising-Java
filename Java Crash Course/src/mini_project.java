import java.util.Scanner;
public class mini_project {
    public static void main(String[] args) {
        int my_Number =(int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        // System.out.println(my_Number); 
        int userNumber;

        do{
            System.out.println("Guess My Number(1-100)");
            userNumber =sc.nextInt();
            if(userNumber == my_Number){
                System.out.println("Wohoo...Correct");
                break;
            }
            else if(userNumber > my_Number){
                System.out.println("Your number too large");
            }
            else{
                System.out.println("Numbe too small");
            }
        } while(userNumber >=0);

        System.out.print("My number was: ");
        System.out.println(my_Number);
    }
}
