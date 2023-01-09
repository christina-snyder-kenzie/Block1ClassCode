import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //subtotal and the taxrate
        //calculate the total

        //how much we want to tip

        //calculate the tip amount by doing some multiplication

        //literal

        //finally, we're gonna calc our actual total
        //and print it out

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your subtotal: $");
        String strSubTotal = scan.nextLine(); //"10.25"
        //"2" -> 2 we use Integer.parseInt()
        //"2.0" -> 2.0 here we use Double.parseDouble()
        double subTotal = Double.parseDouble(strSubTotal);
        //int taxRate = 7;
        double taxRate = 0.07;
        double tipPercentage = 0.20;

        double total = (subTotal * taxRate) + subTotal; //tax + subTotal

        //ORDER of OPERATIONS (PEMDAS)
        //parentheses exponents multiplication/division addition/subtraction

        double tip = total * tipPercentage;

        total = tip + total;

        System.out.println("The tip amount is: $" + tip);
        System.out.println("The total, with tip, is: $" + total);

        System.out.printf("The tip amount is $%.2f\nThe total, with tip, is $%.2f", tip, total);

    }
}


//THIS IS THE DEATH AREA