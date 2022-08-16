import java.util.Scanner;

public class ScannerMathPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a radius: ");

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
