public class GuidedMethodPractice {
    //write a method that returns true if a number is contained
        //within the array, false otherwise
    public static boolean containsNumber(int[] arr, int target){
        for (int currNumber : arr){
            if (currNumber == target){
                return true;
            } /*TERRIBLE IDEA BELOW
            else {
                return false;
            }
            */
        } //ends my loop
        //when I'm done reading, if I never returned true...
        return false;
    }

    public static boolean containsDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int toCheck = arr[i];
            for (int k = i + 1; k < arr.length; k++){
                if (toCheck == arr[k]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean samesame(int[] arrA, int[] arrB){
        //I'm trying to see if A and B contain the same numbers
        for (int currInA : arrA){
            boolean isInB = containsNumber(arrB, currInA);
            if (isInB == false){ //if I'm NOT in there, the final answer is false
                return false;
            }
        }
        //if we get to this point, we never returned false
        //what does that mean?
        //it means... all numbers in A appeared in B

        //can YOU loop over b and see if those numbers appear in A?
        for (int currInB : arrB){
            boolean isInA = containsNumber(arrA, currInB);
            if (!isInA){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 5, 1, 3, 43, 56, 7, 8, 2, 12, 6};
        int target1 = 5;
        int target2 = 9;
        boolean result1 = containsNumber(numbers, target1);
            //should be true
        boolean result2 = containsNumber(numbers, target2);
            //should be false


        int[] puppies = {14, 7, 3, 6, 4, 2, 8};
        int[] kittens = {8, 2, 6, 4, 7, 3, 14, 57};
        int[] fishes = {6, 4, 5, 8, 14, 7, 6};

        boolean pupkit = samesame(puppies, kittens);
            //-> true
        boolean pupfish = samesame(puppies, fishes);
            //-> false

    } //ends main
} //ends class
