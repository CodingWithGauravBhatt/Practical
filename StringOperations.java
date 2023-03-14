package Today14Mar;
public class StringOperations {
    public static void main(String[] args) {
        // Creating the string
        String str = "Welcome to Java World";

        char fifthChar = str.charAt(4);
        System.out.println("Character at 5th position: " + fifthChar);

        boolean result = str.regionMatches(true, 0, "Welcome", 0, 7);
        System.out.println("Comparing 'Welcome' with given string: " + result);

        String concatStr = str.concat(" - Let us learn");
        System.out.println("Concatenated string: " + concatStr);

        int firstOccurrence = str.indexOf('a');
        System.out.println("Position of first occurrence of 'a': " + firstOccurrence);

        // Task 5
        String replacedStr = str.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedStr);

        // Task 6
        String subStr = str.substring(4, 11);
        System.out.println("Substring from 4th to 10th position: " + subStr);

        // Task 7
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}
