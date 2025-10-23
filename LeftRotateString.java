package day4;

/**
 * The LeftRotateString class demonstrates how to
 * perform a one-character left rotation on a given string.
 */
public class LeftRotateString {

    /**
     * Main method for testing the rotateLeft() method.
     */
    public static void main(String[] args) {
        String input = "eat";
        String rotated = rotateLeft(input);
        System.out.println(rotated); // Expected output: "ate"
    }

    /**
     * Rotates the input string one position to the left.
     */
    public static String rotateLeft(String str) {
        // Handle empty or single-character strings gracefully
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Split into first character and the rest
        String firstChar = str.substring(0, 1);
        String remaining = str.substring(1);

        // Concatenate the two parts in reversed order
        return remaining + firstChar;
    }
}
