public class IfStatementBasics {
    public static void main(String[] args) {
        //-2 vs 2
        //relationship to zero
        int number = 2;
        // == != > < >= <= (boolean operators)
        if (number < 0) {
            //execute this code
            System.out.println("Negative");
        }

        if (number > 0) {
            System.out.println("Positive");
        }

        double grade = 97.5;
        if (grade >= 90) {
            System.out.println("A");
        }
        if (grade >= 80 && grade < 90) {
            //true && false -> false
            System.out.println("B");
        }
        if (grade >= 73 && grade < 80) {
            System.out.println("C");
        }
        if (grade >= 70 && grade < 73) {
            System.out.println("D");
        }
        if (grade < 70) {
            System.out.println("F");
        }
        //80 < grade < 90
        //NOT VALID JAVA SYNTAX.
        //You can't have two boolean operators in the same statement
        //we CAN combine complete boolean statements

        //and vs. or
        //&& vs ||
        //AND requires that both sides be true
        //AND is a real needy adult?
        //false && false -> false
        //boolExpr1 && boolExpr2
        //OR only needs one side to be true
        //cookies or cake -> jello is a no go
        //boolExpr1 || boolExpr2

        //grade is 67.5
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 73) {
            System.out.println("C");
        } else if (grade >= 70) {
            System.out.println("D");
        } else { //else has no condition. It's a catch all
            //if nothing else is true, then the else statement will run
            System.out.println("F");
        } //ends my else statement
        //skips to the end. It does not check every condition


        boolean itsBelow65Degrees = true;
        boolean itsRaining = false;
        boolean outsideActivity = true;
        //do I need sunglasses?
            //I need them if it's not raining and I'm going outside
        if (itsBelow65Degrees || itsRaining){
            System.out.println("I need a jacket");
        }
        if (outsideActivity && !itsRaining){
            System.out.println("I need sunglasses");
        }

        int windSpeed = 120;
        if (windSpeed < 74){
            System.out.println("phew. Not even a hurricane");
        } else if (windSpeed <= 95){
            System.out.println("We have a baby cat 1 hurricane");
        } else if (windSpeed <= 110){
            System.out.println("Look out! Cat 2 coming through");
        } else if (windSpeed <= 129){
            System.out.println("Take cover! It's a cat 3 hurricane");
        } else if (windSpeed <= 156){
            System.out.println("Cat 4 says What are you still doing here?");
        } else {
            System.out.println("Get out of town! Cat 5 is here!");
        }

        boolean answer = cigarParty(30, false);
        System.out.println(answer);
    } //ends my main method

    //we're going to use this space today

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        //System.out.println(true);
        //return true;
        //return false;
        //&&
        if (cigars >= 40 && cigars <= 60){
            return true;
        }
        if (isWeekend && cigars >= 40){
            return true;
        }

        return false;
    }


} //ends the file/class

//STAY OUT OF THE DEATH AREA