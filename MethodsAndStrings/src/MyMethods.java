import java.util.Arrays;

public class MyMethods {
    public static void main(String[] args) {
        //instance method
        String str = "hello, world!";
        int length = str.length();

        //static method
        double result = Math.pow(2, 6);

        int answer = add(3, 4);
        System.out.println(answer);

        int numLs = countLs(str);
        System.out.println(numLs);

        int numLsAgain = countLetter(str, 'l');
        int numHs = countLetter(str, 'h');
        int numSpaces = countLetter(str, ' ');
        System.out.println(numSpaces);

        int numVowels = countVowels(str);
        System.out.println(str + " has " + numVowels + " vowels!");

        //implicit parameters with static methods
            //In general, you can ALWAYS put the class name before the dot
            //if you are in the class where the method was created
                //you can just call it without an implicit parameter
            //if you are in a class where the method was NOT created
                //you need the classname as an implicit parameter

        int[] numbers = {7, 5, 1, 3};
        System.out.println(numbers);
        printOut(numbers);
        printOutBackwards(numbers);

        String[] zooAnimals = {"zebra", "giraffe", "elephant", "monkey", "tiger"};
            //zgemt
        String firstLetters = grabFirstLetters(zooAnimals);
        System.out.println(firstLetters);

        String[] flipped = MyMethods.doubleDoubleBackwards(zooAnimals);
        System.out.println(Arrays.toString(flipped));
    } //ends the main method
    //static helper methods

    //I want to know the POSITION of the animal with the LONGEST name
    public static int spotTheLongest(String[] arr){
        //init max -> should this be a string or a length??
                    //-> answer: could be either!! the one you pick will make a difference
                            //in the if statement...
        String max = arr[0];
        //init maxIndex
        int maxIndex = 0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            String currWord = arr[i];
            //if I find something LONGER
            if (currWord.length() > max.length()) {
                //update the max
                max = currWord;
                //update the index
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //doubleDoubleBackwards
    //-> {regit, yeknom, tnahpele, effarig, arbez}
        //{tiger backwards, monkey backwards, e...}
        //reverseString
    public static String[] doubleDoubleBackwards(String[] arr){
        String[] toReturn = new String[arr.length];
        int forwardsIndex = 0;
        for (int backIndex = arr.length - 1; backIndex >= 0; backIndex--){
            String currValue = arr[backIndex];
            String backwards = reverseString(currValue);
            toReturn[forwardsIndex] = backwards;
            forwardsIndex++;
        }
        return toReturn;
    }

    private static String reverseString(String str){
        /*
        init basket
        loop backwards
            add to basket, the current letter
        return basket
         */
        String basket = "";
        for (char currLetter : str.toCharArray()){
            basket = currLetter + basket; //vs basket = basket + currLetter;
        }
        return basket;
    }

    public static String grabFirstLetters(String[] arr){
        String basket = "";
        for (String curr : arr){
            //charAt or substring
            String firstLetter = curr.substring(0, 1);
            basket += firstLetter; //basket = basket + firstLetter;
        }
        return basket;
    }

    public static void printOut(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    //printOutBackWards
    //return type is void
    //parameter is int[] arr
    public static void printOutBackwards(int[] arr){
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }


    //general format
    //public static returnType methodName(dt1 param1, dt2 param2, etc)

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int countLs(String phrase){
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++){
            char currLetter = phrase.charAt(i);
            if (currLetter == 'l'){
                counter++;
            }
        }
        return counter;
    }

    public static int countLetter(String phrase, char targetLetter){
        int counter = 0;
        //for (char currLetter : phrase.toCharArray()){
        for (int i = 0; i < phrase.length(); i++){
            char currLetter = phrase.charAt(i);
            System.out.println(currLetter);
            if (currLetter == targetLetter){
                counter = add(counter, 1);
            }
        }
        return counter;
    }

    public static int countVowels(String phrase){
        int a = countLetter(phrase, 'a');
        int e = countLetter(phrase, 'e');
        int i = countLetter(phrase, 'i');
        int o = countLetter(phrase, 'o');
        int u = countLetter(phrase, 'u');
        return a + e + i + o + u;
    }




} //ends the class
