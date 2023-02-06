package org.example;

public class Activity {
    public static int amount = 0;
    protected String name;

    public Activity(String name){
        this.name = name;
        amount++;
    }

    public void doIt(){
        System.out.println("!!!I'm doing " + name + "!!!");
    }

    @Override
    public String toString(){
        return "Activity Name: " + name;
    }

    /*
    1. Reflexivity test (this == other)
    2. Non-Nullity test (other == null)
    3. Class test ( ! (other instanceof MyClass))
    4. Type Cast (make other MyClass)
    5. Logical Equality Test (me.data == other.data)
     */
    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        if (other == null){
            return false;
        }
        if ( ! (other instanceof Activity)){
            return false;
        }
        Activity otherActivity = (Activity) other;

        return this.name.equals(otherActivity.name);
    }

}

class Exercise extends Activity {

    public static int totalCaloriesBurnedEver = 0;
    protected int caloriesBurned;

    public Exercise(String name){
        super(name);
        caloriesBurned = 0;
    }

    public void burnCalories(){
        caloriesBurned += 10;
        totalCaloriesBurnedEver += 10;
    }

    //overLOAD
    public void doIt(int amtOfTime){
        for (int i = 0; i < amtOfTime; i++){
            burnCalories();
        }
    }

    //overRIDE
    //Changes behavior:
    public void doIt(){
        System.out.println("I'm doing " + name);
    }

    public String toString(){
        String base = super.toString();
        return base + "\nCalories Burned: " + caloriesBurned;
    }
}