package org.example;

public class RecCenter {
    public static void main(String[] args) {
        Activity a1 = new Activity("Dancing");
        a1.doIt();
        System.out.println(a1);

        System.out.println("Total calories so far: " + Exercise.totalCaloriesBurnedEver);

        Exercise e1 = new Exercise("Running");
        e1.doIt();
        e1.doIt(60);
        System.out.println(e1);
        System.out.println("Total calories so far: " + Exercise.totalCaloriesBurnedEver);

        Exercise e2 = new Exercise("Swimming");
        e2.doIt(30);
        System.out.println(e2);
        System.out.println("Total calories so far: " + Exercise.totalCaloriesBurnedEver);

        Exercise e3 = new Exercise("Zumba");
        e3.doIt(60);
        System.out.println(e3);

        System.out.println("Total calories so far: " + Exercise.totalCaloriesBurnedEver);
        System.out.println("COULD say: " + e2.totalCaloriesBurnedEver);

        Craft c1 = new Craft("Knitting");
        c1.buySupplies("Yarn", 2);
        c1.buySupplies("Knitting Needles", 2);
        c1.doIt();


        System.out.println(Activity.amount);

        String x = String.valueOf(123);
        String y = 123 + "";

        Integer z = Integer.parseInt(x);
        short shorty = z.shortValue();
    }
}
