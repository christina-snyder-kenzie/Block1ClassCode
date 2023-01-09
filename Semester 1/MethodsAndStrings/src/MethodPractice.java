public class MethodPractice {

    //THERE

    //write a method that takes in a string and removes all leading punctuation
        //leading punctuation = any character before the first LETTER
    //removeLeadingPuctuation("***,,,hello");
        //-> hello
    //removeLeadingPuctuation("**,,,Hello");
        //-> Hello
    //removeLeadingPuctuation("***,,hello***,,,");
        //-> hello***,,,
    //removeLeadingPuctuation("hello***,,,");
        //-> hello***,,,

    //how do I chop off the first letter?
        //keeping all but the first letter
    //str = str.substring(1);

    //to remove leading punctuation
        //chop off the first character UNTIL the first character is a letter
    //UNTIL = while loop
    public static String chopPunctuation(String str){
        while (!isLetter(str.charAt(0))){ // while the first character is NOT a letter
            //chop it off
            str = str.substring(1);
            //we start at 1 because... I don't want position 0. It's not a letter
        }

        //can we also chop punctuation off the end? (trailing punctuation)
        //to chop off the last letter, we KEEP all BUT the last letter
        //hello123 -> hello12
        //str = str.substring(0, str.length() - 1);
        while (!isLetter(str.charAt(str.length() - 1))){
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    /*
        chop("123hello");
        str->23hello
        str->3hello
        str->hello

     */









    //write  method that tells me if a character is a letter
    public static boolean isLetter(char thing){
        if (thing >= 'A' && thing <= 'Z'){
            return true;
            //I am a capital letter
        } else if (thing >= 'a' && thing <= 'z'){
            return true;
            //I am a lower case letter
        } else {
            return false;
        }
    }




    //can we write a method that returns the last WORD with the MOST amount of caps
        //given a string with words separated by spaces
    //method signature
    public static String findMostCaps(String phrase){
        //split our array into words
        String[] words = phrase.split(" ");
        //init max -> should this be String or Int???
        String max = words[0];
        //loop
        for (int i = 1; i < words.length; i++){
            //if statement
            if (countCap(words[i]) >= countCap(max)){
                //update
                System.out.println(max + " will be updated to: " + words[i]);
                max = words[i];
            }
        }
        return max;
    }




    //counting capital letters
    public static int countCap(String word){
        int counter = 0;
        int counterLowerCase = 0;
        int counterONLYLetters = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (letter >= 'A' && letter <= 'Z'){
                counter++;
            }/* else if (letter >= 'a' && letter <= 'z') {
                counterLowerCase++;
            } else if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z'){
                counterONLYLetters++;
            }*/
        }
        return counter;
    }


    public static void main(String[] args) {

        String toTest = "HeLLO world. HOWS IT gOING?";


        //which word contains the MOST amount of capital letters?
            //if there is a TIE, return the LAST one
        //->gOING

        //which WORD = split it up
        //MOST = Maximum
        //amount = counting

        //how many capital letters does ONE WORD have?



        int count = countCap("ABC123abcXYZxyz");
        System.out.println(count);

        String answer = findMostCaps(toTest);
        System.out.println(answer);

    }

    //HERE
}
