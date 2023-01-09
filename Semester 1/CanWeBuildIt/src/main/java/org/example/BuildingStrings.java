package org.example;

import java.util.Arrays;

public class BuildingStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Pizza and Popcorn");
        char lastLetter = sb.charAt(sb.length() - 1);

        //GOAL: Replace Pizza with Caramel
        //new method: .replace(start, end, newString)
        int indexPizza = sb.indexOf("Pizza");
        System.out.println(sb);
        sb.replace(indexPizza, indexPizza + 5, "Caramel");
        System.out.println(sb);

        //new method: .insert(position, newThing)
        sb.insert(sb.indexOf("Caramel"), "Candy and ");
        System.out.println(sb);

        sb.delete(0, "I love ".length());
        System.out.println(sb);

        String[] loves = sb.toString().split(" and ");

        System.out.println(Arrays.toString(loves));

        String excited = String.join("! ", loves);
        System.out.println(excited);

        System.out.println(fancyFormat(loves));



    }

    /*
    {Candy, Caramel, Popcorn} -> Candy! Caramel! and Popcorn
    {Candy, Caramel, Popcorn, PixieSticks} -> Candy! Caramel! Popcorn! and PixieSticks
    {Caramel, Popcorn} -> Caramel! and Popcorn
    {Popcorn} -> Popcorn
    {} -> ""
    null -> ""
     */
    public static String fancyFormat(String[] data){
        if (data == null){
            return "";
        } else if (data.length == 0){
            return "";
        } else if (data.length == 1){
            return data[0];
        } else {
            //what do I know about data's length if I'm here???
            //GUARANTEE: length is longer than 1 (2 or more)
            //OPTION 1: If statement in loop
                    //if i is less than the last index
                        //do the regular thing
                    //if i is the last index
                        //do the special thing
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length; i++){
                if (i < data.length - 1){
                    sb.append(data[i]);
                    sb.append("! ");
                } else {
                    sb.append("and ");
                    sb.append(data[i]);
                }
            }
            return sb.toString();
            //OPTION 2: End the loop early
                    // Then do Special Stuff at the end
                //in my loop, we do the regular thing
                //outside my loop, we do the special thing
            /*
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length - 1; i++){
                sb.append(data[i]);
                sb.append("! ");
            }
            sb.append("and ");
            sb.append(data[data.length - 1]);
            return sb.toString();›
             */
        }
    }


}
