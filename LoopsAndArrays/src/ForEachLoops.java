public class ForEachLoops {
    public static void main(String[] args) {
        //for each loops
            //are specifically for arrays or collections
            //they're a shortcut for when we need to look at
                //every element from start to finish

        int[] nums = {7, 5, 1, 3};
        for (int i = 0; i < nums.length; i++){
            int currValue = nums[i];
            System.out.print(currValue + " ");
        }

        System.out.println(); //blank space to separate loops

        for (int currValue : nums){
            System.out.print(currValue + " ");
        }
        System.out.println();
        int luckyNumber = (int) (Math.random() * 10);
        int counter = 0;
        for (int currValue : nums){
            if (currValue == luckyNumber){
                counter++;
            }
        }
        System.out.println(luckyNumber + " appears " + counter + " times");

        //I want to calculate the AVERAGE of my array
        //avg = sum of all elements / the number of elements
        int basket = 0;
        for (int number : nums){
            basket += number;
        }
        double avg = (double) basket / nums.length;
        System.out.println("The average is: " + avg);

        //to find the MINIMUM of my array
        //init min
        int min = nums[0];
        //loop
        for (int x : nums){
            //if we find something smaller
            if (x < min) {
                //we update
                min = x;
            }
        }
        System.out.println("The minimum is: " + min);

        //what if I want to find the INDEX of the minimum?
        min = nums[0];
        //loop
        int index = 0;
        int minIndex = 0;
        for (int x : nums){
            //if we find something smaller
            if (x < min) {
                //we update
                min = x;
                minIndex = index;
            }
            index++;
        }
        //If I need an INDEX, I should use a regular loop (not a for each)
        //if I need MORE THAN ONE ELEMENT, I should use a regular loop
        //if I need to go Backwards, I should use a regular loop

        //if I need every element, one at at time, from start to end,
                //I should use a FOR EACH loop




    }
}
