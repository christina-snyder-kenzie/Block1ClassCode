public class FunWithMath {
    public static void main(String[] args){
        //PEMDAS
        int tricky = (2 + 3) * 4 - 2; //18

        //** in Python, NOT A THING IN JAVA

        //Math.pow(base, exp);
        //2^5
        double exp = Math.pow(2, 5);
        System.out.println(exp);

        /*
            Math.pow(base, exp); //raises base to the exp power
            Math.sqrt(value); //square root
            Math.abs(value); //absolute value -> results in a positive number
            Math.round(value); //this uses normal rounding rules
                //.0-.49999 -> rounds down
                //.5+ -> rounds up
            Math.sin(), Math.cos()
         */
        double root = Math.sqrt(16);
        System.out.println(root);

        //print out 2^31 - 1
        //print out Integer.MAX_VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31) - 1);

        double number = 6; //can you put whole numbers into doubles?
        //YES-> it's called promotion
        //promotion happens automatically
        System.out.println(number);

        //int number2 = 7.3; //THIS ERRORS-> possible lossy conversion
        int number2 = (int) 7.9; //casting
        //casting to an int forces truncation
            //truncation means chopping off the decimal
            //NO ROUNDING

        int a = 7 / 2;
        //int b = 7.0 / 2;
        double c = 7 / 2;
        double d = 7.0 / 2;
        double e = (double) 7 / 2;
        System.out.println("A: " + a);
       // System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("E: " + e);
    }
}
