import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        //(int) (Math.random() * 100);
        int[] arr = new int[10];
        int index = 0;
        while (index < arr.length){
            arr[index] = (int) (Math.random() * 100) + 1;
            index++;
        }
        System.out.println(Arrays.toString(arr));

        //count how many numbers are greater than 50
        int index50 = 0;
        int counter = 0;
        while (index50 < arr.length){
            int currValue = arr[index50];
            if (currValue > 50){
                counter++;
            }
            index50++;
        }
        System.out.println("There are " + counter + " numbers greater than 50");

        //SUM the numbers greater than 50
        int i = 0;
        int total = 0;
        while (i < arr.length){
            //variables only exist within the curlies where they are defined
            int currValue = arr[i];
            if (currValue > 50){
                total+=currValue; //total = total + currValue;
            }
            i++;
        }
        System.out.println("The sum of those numbers is: " + total);

        //find the MAXIMUM number
        int maximum = arr[0]; //0?
        int page = 1;
        while (page < arr.length){
            int currNumber = arr[page];
            if (currNumber > maximum){
                maximum = currNumber;
            }
            page++;
        }
        System.out.println("The biggest number is: " + maximum);

        //the POSITION of the MINIMUM
        int currPage = 0;
        int minimum = arr[0];
        int minIndex = 0;
        while (currPage < arr.length){
            int currValue = arr[currPage];
            if (currValue < minimum){
                minimum = currValue;
                minIndex = currPage;
            }
            currPage++;
        }
        System.out.println("The smallest number lives at index " + minIndex);








    }
}
