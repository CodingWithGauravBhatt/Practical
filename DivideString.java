package Today15Mar;

import java.util.Scanner;

public class DivideString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        System.out.print("Enter the number of parts to divide the string into: ");
	        int n = scanner.nextInt();

	        if (s.length() % n != 0) {
	            System.out.println("The string cannot be divided into equal parts.");
	        } else {
	            int partLength = s.length() / n;
	            for (int i = 0; i < s.length(); i += partLength) {
	                String part = s.substring(i, i + partLength);
	                System.out.println(part);
	            }
	        }
	    }
	}
