package day4;

/**
 * The CharacterTypeCounter class analyzes a given string and
 * counts the number of uppercase letters, lowercase letters,
 * digits, and special characters.
 */
public class CharacterTypeCounter {

    /**
     * Main method for testing the countCharacterTypes() method.
     */
    public static void main(String[] args) {
        String input = "Hello World @$%";
        countCharacterTypes(input);
    }

    /**
     * Counts and prints the number of uppercase, lowercase, digit,
     * and special characters in a given string.
     */
    public static void countCharacterTypes(String input) {
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChar = 0;

        // Convert the input string into a character array for iteration
        for (char c : input.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (!Character.isWhitespace(c)) {
                // Any non-alphanumeric, non-space character is a special character
                specialChar++;
            }
        }

        // Display the results
        System.out.println("Uppercase Letters: " + upperCase);
        System.out.println("Lowercase Letters: " + lowerCase);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChar);
    }
}
