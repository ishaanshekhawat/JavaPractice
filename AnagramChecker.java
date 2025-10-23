package day4;

import java.util.Arrays;

/**
 * The AnagramChecker class provides a method to determine
 * whether two given strings are anagrams of each other.
 */

public class AnagramChecker {

    /**
     * Main method for testing the checkAnagram() method.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "ate";

        checkAnagram(s1, s2);
    }

    /**
     * Checks whether two strings are anagrams and prints the result.
     * Two strings are considered anagrams if they contain the same
     * characters in any order, ignoring case and whitespace.
     */
    public static void checkAnagram(String s1, String s2) {
        // Remove all whitespace and convert both strings to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Quick length check: if lengths differ, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("These strings are NOT anagrams (different lengths).");
            return;
        }

        // Convert strings to character arrays
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        // Sort both arrays alphabetically
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        // Compare sorted arrays to determine if they are identical
        if (Arrays.equals(s1Arr, s2Arr)) {
            System.out.println("These strings are anagrams.");
        } else {
            System.out.println("These strings are NOT anagrams.");
        }
    }
}
