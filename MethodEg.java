package Class;

public class MethodEg {
public static void main(String[] args) {
	int num1 = 5;
	int num2 = 4;
	// method calling
	int c=addition(num1,num2); 
	System.out.println("sum:"+" "+c);
}
 public static int addition(int num1, int num2) {
	int sum;
	sum=num1+num2;
	return sum;
	
}
}
