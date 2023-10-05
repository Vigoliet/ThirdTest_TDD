package org.example;

public class TextUtility {


public String text;


    public TextUtility(String text) {
        this.text = text;
    }

    // will return true if it is
    // will return if it isn't
    public boolean isPalindrome(String text) {
        String cleanedText = text.toLowerCase();
        cleanedText = cleanedText.replace(" ",""); // Removes all spaces
        cleanedText = cleanedText.replaceAll("[^a-zA-Z0-9_-]", ""); // Removes all special characters

        int left = 0, right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
