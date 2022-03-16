package org.launchcode.java.studios.countcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> storedChars = new HashMap<>();

        System.out.print("Enter a quote: ");

        String quote = input.nextLine();

        for (char character : quote.toCharArray()) {
            String convertedChar = Character.toString(character).toLowerCase();
            if (storedChars.containsKey(convertedChar)) {
                storedChars.put(convertedChar, storedChars.get(convertedChar) + 1);
            } else {
                storedChars.put(convertedChar, 1);
            }
        }

        for (Map.Entry<String, Integer> character : storedChars.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
