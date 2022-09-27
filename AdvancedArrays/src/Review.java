import java.util.Arrays;

public class Review {
    //method signature is the first line of the method

    //my GOAL: remove punctuation
    public static String removePunc(String str){
        //TODO: actually remove the punctuation
        if (str.length() == 0){
            return "";
        }
        while (!(str.charAt(0) >= 'a' && str.charAt(0) <= 'z')){
            str = str.substring(1);
            if (str.length() == 0){
                return "";
            }
        }
        return str;
    }



    //my GOAL: make a new array with ONLY actual words (non-zero length)
    //collect non-zero length words
    //"  hello    world   goodbye   moon    pluto    "
    //-> {"hello", "world", "goodbye", "moon", "pluto"}
    public static String[] grabRealWords(String str){
        //dt[] name = new dt[size];
        int size = countActualWords(str.split(" "));
        String[] toReturn = new String[size];
        String[] possibleWords = str.split(" ");
        int specialIndex = 0;
        for (int i = 0; i < possibleWords.length; i++){
            if (removePunc(possibleWords[i]).length() > 0){
                toReturn[specialIndex] = removePunc(possibleWords[i]);
                specialIndex++;
            }
        }
        return toReturn;
    }


    //My GOAL: count the number of actual words (non-zero length)
    public static int countActualWords(String[] possibleWords){
        int counter = 0;
        for (int i = 0; i < possibleWords.length; i++){
            String curr = possibleWords[i];
            String noPunc = removePunc(curr);
            if (noPunc.length() != 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        /*
        1. ReturnType -> what the method returns
            (void, int, double, int[], String, String[], etc)
        2. MethodName -> typically tells us what the method does
            (countLetter(str, letter)
            capAt10(arr)
            charAt(index))
        3. Parameters -> the inputs
            (dataType name)
        4. Guts -> the meat of the method, the part that does stuff
            what's inside the curly brackets
            performs an algorithm!
         */

        String words = "  hello  ???  world   goodbye   moon   !!!!     ";
        String better = "hello world goodbye moon";
        int numCharacters = better.length(); //with parens-> for Strings
        int numWords = better.split(" ").length; //without parens-> for arrays
            //doesn't matter what type of array, String[], int[], double[]
            //they all use .length no parens

        int numWordsWithSpaces = words.split(" ").length;
        System.out.println(Arrays.toString(words.split(" ")));
        String first = words.split(" ")[0];
        System.out.println(first + ", : " + first.length());
        System.out.println(numWordsWithSpaces);

        int numWordsActual = countActualWords(words.split(" "));
        System.out.println(numWordsActual);

        String[] realWords = grabRealWords(words);
        System.out.println(Arrays.toString(realWords));
        System.out.println(realWords.length);
    }


}
