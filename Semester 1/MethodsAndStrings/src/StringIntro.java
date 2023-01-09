public class StringIntro {
    public static void main(String[] args) {
        String place = "Bahamas";
        int numLetters = place.length();
        String school = "Kenzie Academy";
        int numLetters2 = school.length();

        //string methods
            //these are instance methods of the String Class
            //an instance method ACTS UPON an instance of an object

        //an instance is a particular existing of an object

        //implicit parameters come BEFORE the dot
            //only 1
        //explicit parameters go inside the parentheses
            //0 to many

        boolean result = place.equals(school);

        //general instance method syntax:
            //implicit.methodName(explicit);

        //charAt-> grabs a single character
            //char varName = str.charAt(index);
        char firstLetter = place.charAt(0);
        char lastLetter = place.charAt(place.length() - 1);
        System.out.println(place + " begins with " + firstLetter);
        System.out.println(place + " ends with " + lastLetter);

        //substring-> grabs a portion of your string
        //substring is OVERLOADED
        //(means same method, different explicit parameters)
            //String portion = str.substring(startingPos);
                //start at startingPos and go to the end of the string
                //to get the LAST X letters-> str.substring(len - X);
            //String portion = str.substring(start, stop);
                //start at start and go up to but not including stop
                    //stop is exclusive
                    //start is inclusive

        String allButFirst = place.substring(1);
        System.out.println(allButFirst);
        String tricky = place.substring(place.length() - 3);
        System.out.println(tricky);
        String last = place.substring(place.length() - 1);
        System.out.println(last);

        String firstBit = place.substring(0, 3);
        System.out.println(firstBit);
        String wholeThing = place.substring(0, place.length());
        //Bahamas
        String test = place.substring(2, 6);
        System.out.println(test);


        //indexOf(babyString) -> returns the first index of the babyString
            //int pos = bigStr.indexOf(littleString);
            //pos will be -1 if the littleString does not exist
        int posOfM = place.indexOf("m");
        System.out.println("The 'm' lives at : " + posOfM);
        int posOfHama = place.indexOf("hama"); //2
        int posOfBama = place.indexOf("bama"); //-1
        int posOfA = place.indexOf("a"); //1

        //replace(oldStr, newStr) -> replaces every oldStr with the new string
        String hipAndCool = place.replace("s", "$");
        System.out.println(hipAndCool);
        String extraHip = place.replace("a", "@");
        System.out.println(extraHip);
        System.out.println(place);
        String noAs = place.replace("a", "");
        System.out.println(noAs);

        //Strings are IMMUTABLE, which means they can't change
            //they can be overwritten, but they do not change

        //split(delimiter) -> returns an array of things that
                         //  were separated by the delimiter
            //delimiter-> separator
                //1,2,3 -> delimiter = comma
                //hello world goodnight moon -> delimiter = space
        String sentence = "I come before you to stand behind you";
        String[] words = sentence.split(" ");
        for (String str : words){
            System.out.println(str);
        }
        System.out.println("-------------");
        String[] pieces = sentence.split("o");
        for (String str : pieces){
            System.out.println(str);
        }

        //toCharArray() -> returns an array of characters of your string
            //char[] letters = someString.toCharArray();
        char[] letters = place.toCharArray();
        for (char let : letters){
            System.out.print(let + "|");
        }










    }
}
