public class ForLoopExamples {
    public static void main(String[] args) {
        /*
            intitialization
            while (condition){
                do stuff
                incrementation
            }

            QUEUE: The FOR Loop
            for (initialize ; condition ; incrementation){
                do stuff
            }
         */

        int[] arr = {7, 5, 3, 1, 8, 6};
        //print out all numbers on same line separated by space

        for (int index = 0 ; index < arr.length ; index++){
            System.out.print(arr[index] + " ");
        }

        //calculate the average value
        int basket = 0;
        for (int index = 0; index < arr.length; index++){
            int currValue = arr[index];
            basket += currValue;
            //basket += arr[index];
        }
        int avg = basket / arr.length;
        System.out.println("\nThe average is: " + avg);

        //print out only numbers from 1 to 10
        for (int number = 1; number <= 10; number += 1){
            System.out.print(number + " ");
        }

        int[] doubles = {2, 2, 3, 3, 4, 5, 6, 6, 7, 7};
        //COUNT how many Adjacent Duplicates there are
            //adjacent duplicate = neighbors with same value (2, 2)
        int counter = 0;
        for (int index = 0; index < doubles.length - 1; index++){
            int currValue = doubles[index];
            int neighbor = doubles[index + 1];
            if (currValue == neighbor){
                counter++;
            }
        }
        System.out.println("\nYou have " + counter + " adj. dups!");
    }
}
