package Today15Mar;
import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("The strings are not rotations of each other.");
        } else {
            String s1s1 = s1 + s1;
            if (s1s1.contains(s2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }
    }
}
