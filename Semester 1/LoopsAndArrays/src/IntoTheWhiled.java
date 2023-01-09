public class IntoTheWhiled {
    public static void main(String[] args) {

        int number = 5;

        if (number < 10){
            System.out.println("hello-" + number);
        }

        //while loops execute UNTIL the condition becomes false
        while (number < 10) {
            System.out.println("hello-" + number);
            number = number + 1; //incrementation
        } //ends my while loop

        System.out.println("While loop finished");
        System.out.println("number is: " + number);

        //I want to print multiples of 3 from 0->20
        //0, 3, 6, 9, 12, 15, 18
        int counter = 0; //initialization
        while (counter < 20){ //boolean condition
            System.out.println("counter: " + counter); //do stuff
            counter = counter + 3; //incrementation/update
        }

        int timer = 10;
        //1
        System.out.println("...Initiating Countdown Sequence...");
        while (timer > 0){
            System.out.println(timer);
            //2
            timer = timer - 1;
           //3
        }
        //4
        System.out.println("BLASTOFF!!");

        //all the POWERS OF 2 from 1 -> 100
        //1, 2, 4, 8, 16, 32, 64
        //0, 1, 2, 3, 4, 5, 6

        double answer = 1;
        while (answer < 100){
            System.out.println("The power of 2 is: " + answer);
            answer = answer * 2;
        }

        int exponent = 0;
        while (Math.pow(2, exponent) < 100){
            System.out.println("The power of 2 is: " + Math.pow(2, exponent));
            exponent = exponent + 1;
        }

        //print out multiples of 5 starting at 100 and stopping at 5
            //100, 95, 90, ... 15, 10, 5
        //print out powers of 2 starting at 128 and doing down to 1
            //128, 64, 32, 16, 8, 4, 2, 1
            //HINT: 2 ^ 7 == 128
        //print out even numbers between 0 and 99
            //0, 2, 4, 6... 96, 98







    }
}
