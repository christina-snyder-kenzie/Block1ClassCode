public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //this is a comment
        //it's not code
        //its just text

        //DataType variableName = value;

        /*
        Variable Naming Rules and Conventions
        Rule:
            1. NO SPACES
            2. AlphaNumeric (letters and numbers but also _ and maybe $?)
            3. Must start with a letter (or an underscore)
                (CANNOT start with a number)
        Convention:
            1. camelCase whereWeCapitalizeEveryWord
            2. start with a lowercase letter
            3. descriptive
         */

        int numberOfDogs = 3;
        int numFishes = 15;

        //declaration
        //initialization

        int totalAnimals = numberOfDogs + numFishes;
        System.out.println(totalAnimals);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE - 1); //final variables (also static)

        System.out.println(Integer.MAX_VALUE + 1);//arithmetic overflow
    }
}