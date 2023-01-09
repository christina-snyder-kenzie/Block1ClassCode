import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        double monTemp = 98;
        double tuesTemp = 99;
        double wedTemp = 73;
        double thursTemp = 84;
        double friTemp = 97;

        //arrays are a data structure that hold more than one value!

        //dataType[] name =
            //option1: {val1, val2, val3};
            //option2: new dataType[size]; //size -> the number of things I want to hold
                //this fills the array with default values
                    //Default Values:
                    //String -> null
                    //int -> 0
                    //double -> 0.0
                    //boolean -> false

        double[] weeklyTemps = {98, tuesTemp, 73, thursTemp, 97};
        System.out.println(weeklyTemps.length);
        System.out.println(Arrays.toString(weeklyTemps));

        System.out.println("Tuesday's Temp was: " + weeklyTemps[1]);
        //update/edit: arrayName[position] = newValue;
        weeklyTemps[1] = 100.0;
        System.out.println("updated: " + Arrays.toString(weeklyTemps));

        String[] guestList = new String[6];
        guestList[0] = "me";
        guestList[1] = "Charles";
        guestList[2] = "Oprah";
        guestList[3] = "Bob Ross";
        guestList[4] = "Beyonce";
        guestList[5] = "Michael";
        System.out.println(Arrays.toString(guestList));

        System.out.println(Arrays.toString(new int[4]));

        int[] numbers = {7, 5, 1, 3, 8, 2, 5, 9};
        System.out.println(numbers.length); //length is an attribute, not a method
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        //length is 5
        //the middle element in numbers is 1
            //which lives at index 2
        //5 / 2 -> 2.5? NO! its 2

        //length is 11
            //middle number is 4
            //middle index is 5
        //11 / 2 -> 5.5? NO its 5

        int middle = numbers[numbers.length / 2];
        int secondToLast = numbers[numbers.length - 2];


        //How do we SWAP elements
        //I want to swap the first and last element
            //numbers[0] = numbers[numbers.length - 1];
            //numbers[numbers.length - 1] = numbers[0];
        //THIS IS THE WRONG ANSWER (this is a rookie mistake)

        //BELOW is the right answer
        int saved = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = saved;
        //a SWAP requires AT LEAST 3 lines of code


    } //ends the main method
}//ends the file
