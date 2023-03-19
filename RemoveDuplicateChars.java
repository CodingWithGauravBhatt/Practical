package Today15Mar;
import java.util.Scanner;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        String result = removeDuplicateChars(str1, str2);

        System.out.println("Result: " + result);
    }

    public static String removeDuplicateChars(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[256];

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            visited[ch] = true;
        }

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!visited[ch]) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}