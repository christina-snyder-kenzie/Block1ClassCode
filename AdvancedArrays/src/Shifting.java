import java.util.Arrays;

public class Shifting {
    public static void main(String[] args) {
        //shifting -> sliding, or moving

        //{7, 5, 1, 3} -> {0, 7, 5, 1} SHIFT to the right
        //{7, 5, 1, 3} -> {5, 1, 3, 0} SHIFT to the left

        //ROTATION:
            //left rotation:
                //{7, 5, 1, 3} -> {5, 1, 3, 7}
            //right rotation:
                //{7, 5, 1, 3} -> {3, 7, 5, 1}
        int[] numbers = {7, 5, 1, 3};
        System.out.println(Arrays.toString(numbers));
        rotateLeft(numbers);
        System.out.println(Arrays.toString(numbers));
        rotateLeft(numbers);
        System.out.println(Arrays.toString(numbers));
        rotateRight(numbers);
        System.out.println(Arrays.toString(numbers));
        rotateRight(numbers);
        System.out.println(Arrays.toString(numbers));


        //Removing an element from an array at a particular index
        //{7, 5, 1, 3, 8, 2} -> {7, 5, 3, 8, 2}
        //KNOW: Index = 2, LengthOld = 6, LengthNew = 5
            //toReturn[2] = arr[3];
            //toReturn[3] = arr[4];
            //toReturn[4] = arr[5];

        //i is going to start at 2.
            //toReturn[i] = arr[i + 1];
        //i needs to go up to and include the 4 -> i < 5

    }

    public static int[] removeIndex(int[] arr, int index){
        int[] toReturn = new int[arr.length - 1];
        for (int i = 0; i < index; i++){
            toReturn[i] = arr[i];
        }
        for (int i = index; i < toReturn.length; i++){
            toReturn[i] = arr[i + 1];
        }
        return toReturn;
    }


    //RIGHT ROTATION:
    //1. Save the last guy
    //2. Shift to the RIGHT
    //3. Insert the saved guy at the front

    public static void rotateRight(int[] arr){
        int lastGuy = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = lastGuy;
    }

    //steps for a left rotation
    //I'm doing it IN PLACE (I'm NOT Making a new array-> I'm changing the one I HAVE)
    //1. Save that first number
    //2. shift the rest of the numbers
    //3. Insert that saved number

    public static void rotateLeft(int[] arr){
        int saved = arr[0];
        //BLUE solution
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = saved;

        /*
        GREEN solution
        for (int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
         */
    }

}
