package org.example;

import java.util.*;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, Integer> medals = new HashMap<>();
        medals.put("Norway", 16);
        medals.put("Germany", 12);
        medals.put("China", 9);
        medals.put("USA", 8);
        medals.put("Sweden",  8);

        System.out.println(medals);

        String x = "hello";
        System.out.println(x.hashCode());
        Integer y = 123456;
        System.out.println(y.hashCode());
        String z = "HELLO";
        System.out.println(z.hashCode());

        int golds = medals.get("USA");
        System.out.println(golds);

        //This causes NPE
        //int canadasGolds = medals.get("Canada");

        int canadasGolds = medals.getOrDefault("Canada", -1);
        System.out.println(canadasGolds);

        for (String key : medals.keySet()){
            System.out.println(key);
            System.out.println(medals.get(key));
        }
        System.out.println("-------------");
        for (HashMap.Entry<String, Integer> entry : medals.entrySet()){
            System.out.println(entry);
            System.out.println("Key: " + entry.getKey());
            System.out.println("Val: " + entry.getValue());
        }
        System.out.println("-------------");
        for (Integer value : medals.values()){
            System.out.println(value);
        }
    }
}

















