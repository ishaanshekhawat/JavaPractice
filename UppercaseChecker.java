package day4;

/**
 * The UppercaseChecker class determines whether
 * a given string is composed entirely of uppercase letters.
 */
public class UppercaseChecker {

    /**
     * Main method for testing the isAllUppercase() method.
     */
    public static void main(String[] args) {
        String input = "HELLO";
        checkAllUppercase(input);
    }

    /**
     * Checks if the given string contains only uppercase letters
     * and prints the result to the console.
     */
    public static void checkAllUppercase(String input) {
        // Assume the string is all uppercase until proven otherwise
        boolean allUppercase = true;

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // If any character is not uppercase, set flag to false and stop checking
            if (!Character.isUpperCase(c)) {
                allUppercase = false;
                break;
            }
        }

        // Display the result
        if (allUppercase) {
            System.out.println("The string is all uppercase.");
        } else {
            System.out.println("The string is NOT all uppercase.");
        }
    }
}
