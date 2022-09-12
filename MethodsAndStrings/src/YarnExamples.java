public class YarnExamples {
    public static void main(String[] args) {
        String place = "Bahamas";

        //count the number of 'a's in the string

        /*
            init counter
            loop
                if it's an A
                    counter++;
         */

        //place.charAt(i) == 'a'
        //place.substring(i, i+1).equals("a")
                //substring(i, i + x) gives me a window of size x
                    //substring(i, i+1) gives me one letter at a time
                    //substring(i, i+2) gives me two letters at a time
        //first convert to a char Array, and then see if letters[i] == 'a'
        int counterOfAs = 0;
        for (int i = 0; i < place.length(); i++){
            String currentLetter = place.substring(i, i + 1);
            if (currentLetter.equals("a")){
                counterOfAs++;
            }
        }

        String sentence = "I love pecan pie and pumpkin spice lattes";
        //1. I want to know how many 'pi's there are (2)
                //the sliding window algorithm
        int counterOfPIs = 0;
        for (int i = 0; i < sentence.length() - 1; i++){
            String window = sentence.substring(i, i + 2);
            System.out.println(window);
            if (window.equals("pi")){
                counterOfPIs++;
            }
        }
        //2. I want to know how many WORDS START with 'p'
        String[] words = sentence.split(" ");
        int countP = 0;
        for (String currWord : words){
            int indexOfP = currWord.indexOf("p");
            if (indexOfP == 0){
                countP++;
            }

            /*
            String firstLetter = currWord.substring(0, 1);
            if (firstLetter.equals("p")){
                countP++;
            }

            OR

            char firstLetter = currWord.charAt(0);
            if (firstLetter == 'p'){
                countP++;
            }
             */
        }
        System.out.println(countP + " words start with p!");




    }
}
