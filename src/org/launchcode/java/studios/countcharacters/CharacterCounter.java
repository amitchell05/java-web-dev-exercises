package org.launchcode.java.studios.countcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> storedChars = new HashMap<>();

        System.out.print("Enter a quote: ");

        String quote = input.nextLine();
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        for (char character : quote.toCharArray()) {
            if (storedChars.containsKey(character)) {
                storedChars.put(character, storedChars.get(character) + 1);
            } else {
                storedChars.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : storedChars.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
