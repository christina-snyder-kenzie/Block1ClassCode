import java.util.Scanner;

public class ScannerMathPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        //"1.5".length() -> 3
        //"1.5" + 2 -> "1.52"
        //Double.parseDouble("1.5") -> 1.5 + 2 -> 3.5
        //or Integer.parseInt()
        double rad = Double.parseDouble(scan.nextLine());

        //circumference = pi*diameter or 2*pi*r
        //area = pi R^2
        //volume of a sphere = (4/3)pi R^3
        double circ = 2 * Math.PI * rad;
        double area = Math.PI * Math.pow(rad, 2);
        double volume = ((double)4/3) * Math.PI * Math.pow(rad, 3);

        System.out.println("Circumference: " + circ);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);






    }
}
