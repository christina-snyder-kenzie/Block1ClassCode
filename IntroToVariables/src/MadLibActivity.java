import java.util.Scanner;

public class MadLibActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an adjective: ");

        String adj1 = scan.nextLine();
        System.out.println("Enter another adjective: ");

        String adj2 = scan.nextLine();

        System.out.println("Have a " + adj1 + ", " + adj2 + " day!");

    }

}
