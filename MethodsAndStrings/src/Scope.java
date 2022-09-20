import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {
        //ints are primitive types
        int x = 7;
        int y = x;
        y = y + 1;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        //arrays are technically objects
        int[] nums = {7, 5, 1, 3};
        int[] copy = nums; //SHALLOW copy

        copy[0] = copy[0] + 1;

        System.out.println("Nums[0]: " + nums[0]);
        System.out.println("Copy[0]: " + copy[0]);

        System.out.println(x + ", " + nums);

        //to perform a DEEP copy
        //first, make a new array
        //when I make an array using the NEW operator, it finds a NEW place in memory
        int[] deepCopy = new int[nums.length];
        //right now, deep copy is filled with default values
        //second, I loop and copy each value
        for (int i = 0; i < nums.length; i++){
            deepCopy[i] = nums[i];
        }
        deepCopy[0] = 1002;
        System.out.println("Nums[0]: " + nums[0]);
        System.out.println("DeepCopy[0]: " + deepCopy[0]);

        int a = 2;
        int b = 3;
        int[] c = {14, 12, 17, 2};
        int d = funWithScope(a, b, c);
        //after this code has run, what are a, b, c, d, x, y, z?
        //System.out.println(z);
        capAt10(c);
        System.out.println(Arrays.toString(c));

        int tricky = 104;
        capINTat10(tricky);
        System.out.println(tricky);
    }

    public static void capINTat10(int x){
        if (x > 10){
            x = 10;
        }
    }

    //write a method called cap at 10, which replaces all values greater than 10 with 10
    public static void capAt10(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 10){
                arr[i] = 10;
            }
        }
    }

    public static int funWithScope(int x, int y, int[] z){
        x += y;
        z[0] += 10;
        return x;
    }
}
