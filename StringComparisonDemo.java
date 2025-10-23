package day4;

/**
 * The StringComparisonDemo class demonstrates the difference between
 * the {@code equals()} and {@code equalsIgnoreCase()} methods
 * when comparing Java strings.
 */
public class StringComparisonDemo {

    /**
     * Main method that compares strings using different equality checks.
     */
    public static void main(String[] args) {
        
        // Define three strings for comparison
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // equals() checks for exact match (case-sensitive)
        System.out.println("Using equals(): " + str1.equals(str2)); // true

        // equalsIgnoreCase() ignores case differences during comparison
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3)); // true
    }
}
