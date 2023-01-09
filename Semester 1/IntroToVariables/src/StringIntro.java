public class StringIntro {
    public static void main(String[] args) {

        //this is our happy place

        //reserved words

        //String is an object type
            //Strings have special abilities
        String word = "pizza";
        System.out.println(word);
        System.out.println("word");


        //length -> the number of letters in a string
        int numLetters = word.length();
        System.out.println(word + " has " + numLetters + " letters");

        System.out.println("\"" + word + "\" has " + numLetters + " letters");

        System.out.println("\t\t\t\thello, \nworld");

        System.out.println(3 == 3);
        System.out.println(3.14 == 3.14);

        String test = new String("hello");
        String other = new String("hello");
        System.out.println(test);
        System.out.println(other);
        System.out.println(test == other);
        System.out.println(test == test);

        System.out.println(test.equals(other));
        System.out.println(test.equals(test));
        System.out.println(test.equals("HELLO"));
        System.out.println(test.equalsIgnoreCase("HELLO"));
        System.out.println(test.equalsIgnoreCase("H E L L O"));

        String better = "AvOcAdO";

        String allLowerCase = better.toLowerCase();
        String ALLUPPERCASE = better.toUpperCase();

        System.out.println(allLowerCase);
        System.out.println(ALLUPPERCASE);

        String empty = "";
        System.out.println(empty.length());

    }


    //THE DEATH AREA

}
//ALSO DEATH DOWN HERE