package ControlStatement;

import java.util.Scanner;

public class Dowhileeg4 {
public static void main(String[] args) {
	int sum = 0;
	int number = 0;
	
	Scanner sc = new Scanner(System.in);
	do {
		sum+=number;
		System.out.println("Enter The Number");
		number = sc.nextInt();
	} while (number >=0);
	System.out.println("sum is:" +sum);
	sc.close();
}
}
