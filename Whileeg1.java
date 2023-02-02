package ControlStatement;

import java.util.Scanner;

public class Whileeg1 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		 while (true) {
			 number = sc.nextInt();
			 if(number<0)break;
			 sum+=number;
			 }
		System.out.println("sum is:" +sum);
		sc.close();
	}
	}