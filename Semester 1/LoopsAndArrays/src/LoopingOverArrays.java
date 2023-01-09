public class LoopingOverArrays {
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 3, 9, 8, 11, 10, 3, 2};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        int number = 0;
        while (number < arr.length) {
            System.out.println(number + ": " + arr[number]);
            number += 1; //number = number + 1
        }

        /*
        General formula for looping over an array (forwards)
        int index = 0;
        while (index < arrName.length){
            //do something with arrName[index];
            ++index; index++; index += 1; index=index + 1... some kind of incr;
        }
         */
        System.out.println("-------ODDS BELOW-------");
        //we want to print odd ELEMENTS
        int index = 0;
        while (index < arr.length) {
            if (arr[index] % 2 == 1) {
                System.out.println(arr[index]);
            }//ends if
            index++;
        }//ends while

        //write a loop that will print ONLY numbers greater than 5
        System.out.println("-------Greater than 5 BELOW--------");
        int i = 0;
        while (i < arr.length) {
            int currNumber = arr[i];
            if (currNumber > 5) {
                System.out.println(currNumber);
            }
            i = i + 1;
        }

        //print out our array BACKWARDS
        //initialization
        //while (condition){
            //do stuff
            //increment/decrement
        //}
        int backwardsIndex = arr.length - 1;
        while (backwardsIndex >= 0){
            System.out.println(arr[backwardsIndex]);
           // backwardsIndex++; //wrong
            backwardsIndex--; //backwardsIndex -= 1 //backwardsIndex = backwardsIndex - 1
        }

        int basket = 0; //represents our collection
        int counter = 0; //this represents our position
        while (counter < arr.length){
            int thing = arr[counter];
            basket = basket + thing; //basket += thing;
            counter++;
        }
        System.out.println("the sum is: " + basket);
    }
}
