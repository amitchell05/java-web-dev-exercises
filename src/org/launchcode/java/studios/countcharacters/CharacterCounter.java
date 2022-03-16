package org.launchcode.java.studios.countcharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> storedChars = new HashMap<>();

        Path directory = Paths.get("C:\\Users\\Yoga 2 Mitchell\\IdeaProjectsTemp\\src\\org\\launchcode\\java\\studios\\countcharacters");
        Path quotePath = directory.resolve("quote.txt");

        String quote = Files.readString(quotePath);

        for (char character : quote.toCharArray()) {
            String convertedChar = Character.toString(character).toLowerCase();
            if (storedChars.containsKey(convertedChar)) {
                storedChars.put(convertedChar, storedChars.get(convertedChar) + 1);
            } else if (Character.isLetterOrDigit(character)){
                storedChars.put(convertedChar, 1);
            }
        }

        for (Map.Entry<String, Integer> character : storedChars.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
