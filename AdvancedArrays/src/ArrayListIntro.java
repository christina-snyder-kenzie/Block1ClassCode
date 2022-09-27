import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<String>();
        System.out.println(guests);
        System.out.println(guests.size());

        guests.add("Bob Weir");
        guests.add("Elvis");
        guests.add("Santana");
        guests.add("Sting");

        //I want to squeeze in Freddie between bob and elvis
        guests.add(1, "Freddie Mercury");
        System.out.println(guests);
        guests.add(0, "Beyonce");
        System.out.println(guests);

        //I want to replace String with Johnny Cash
        guests.set(guests.size() - 1, "Johnny Cash");
        System.out.println(guests);

        //Beyonce is too busy for dinner
        //Can we remove her from the guestList?
        guests.remove(0);
        System.out.println(guests);

        boolean ElvisIsComing = guests.contains("Elvis");
        boolean BeyonceIsComing = guests.contains("Beyonce");
        System.out.println("Elvis? : " + ElvisIsComing);
        System.out.println("Beyonce? : " + BeyonceIsComing);
        System.out.println(grabInitials(guests));
        ArrayList<Integer> boring = generateRandom(10, 1, 10);
        System.out.println(boring);
        ArrayList<Integer> exciting = generateRandom(100, 500, 800);
        System.out.println(exciting);

        double average = calcAverage(exciting);
        double max = findMax(exciting);
        System.out.println("Avg: " + average + ", Max: " + max);

        int[] bigGuys = makeArray700(exciting);
        System.out.println(Arrays.toString(bigGuys));

        ArrayList<Integer> bigGuysList = makeList700(exciting);
        System.out.println(bigGuysList);
    }
    //we want an ARRAY with only the numbers > 700
    public static int[] makeArray700(ArrayList<Integer> numbers){
        //dt[] name = new dt[size];
        int count = 0;
        for (int num : numbers){
            if (num > 700){
                count++;
            }
        }
        int[] only700 = new int[count];
        int index = 0;
        for (int num : numbers){
            if (num > 700){
                only700[index] = num;
                index++;
            }
        }
        return only700;
    }

    //we want an ArrayList with only the numbers > 700
    public static ArrayList<Integer> makeList700(ArrayList<Integer> numbers){
        ArrayList<Integer> only700 = new ArrayList<Integer>();
        for (int num : numbers){
            if (num > 700){
                only700.add(num);
            }
        }
        return only700;
    }

    //Write TWO METHODS:
    //[7, 5, 1, 3]
    public static double calcAverage(ArrayList<Integer> numbers){
        double basket = 0;
        for (int i = 0; i < numbers.size(); i++){
            int currNumber = numbers.get(i);
            basket += currNumber;
        }
        return basket / numbers.size();
    }

    public static int findMax(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for (int currNumber : numbers){
            if (currNumber > max){
                max = currNumber;
            }
        }
        return max;
    }

    public static float findMaxFloat(ArrayList<Float> numbers){
        float max = numbers.get(0);
        for (float currNumber : numbers){
            if (currNumber > max){
                max = currNumber;
            }
        }
        return max;
    }


    //I want to create a method that generates N random integers
        //between A, B and collects them in an ArrayList
    //int x = (int) (Math.random() * (B - A + 1) + A);
    public static ArrayList<Integer> generateRandom(int N, int A, int B){
        //Alter this, so that we do not have duplicate numbers!
        //think: 100 numbers between 1 and 10 is IMPOSSIBLE
        //avoid impossibility -> if its IMPOSSIBLE, return an empty list
        if (N > B - A + 1){
            return new ArrayList<Integer>();
        }
        //1 -> Initialization
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < N; i++){
            //2
            int x = (int) (Math.random() * (B - A + 1) + A);
            //3 -> add it
            while (toReturn.contains(x)){
                x = (int) (Math.random() * (B - A + 1) + A);
            }
            toReturn.add(x);
        }
        //4
        return toReturn;
    }


    //GOAL: collect first initials into a single string
    public static String grabInitials(ArrayList<String> names){
        String basket = "";
        for (int i = 0; i < names.size(); i++){
            String currName = names.get(i);
            String firstLetter = currName.substring(0, 1);
            basket += firstLetter;

            //basket += names.get(i).substring(0, 1);
        }
        return basket;
    }


}
