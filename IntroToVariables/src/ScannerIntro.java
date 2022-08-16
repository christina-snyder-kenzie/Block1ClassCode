import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Hello " + name);

        System.out.println(name + ", what is your favorite color?");

        String favColor = scan.nextLine();

        System.out.println(favColor + "???? That's mine too!");

        System.out.println("How many brothers do you have?");
        String brothers = scan.nextLine();
        System.out.println("How many sisters do you have?");
        String sisters = scan.nextLine();
        /*
        data conversions

        brothers -> "2"
        we need to change it to the number 2

        "2" -> 2

        int realNumber = Integer.parseInt(strVersion);
         */
        int numBros = Integer.parseInt(brothers);
        int numSisters = Integer.parseInt(sisters);
        int numSiblings = numBros + numSisters;
        System.out.println("You have " + numSiblings + " siblings!");

    }
}

//THE DEATH AREA