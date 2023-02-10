package Class;

public class StaticEg2 {
static int add(int a,int b) {
	return a+b;
}
public static void main(String[] args) {
	int c= StaticEg2.add(423, 3120);
	System.out.println(c);
}
}
