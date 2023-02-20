package Class;
class Shape2{
	Shape2(){
		System.out.println("Hello");
	}
}
class Size2 extends Shape2{
	Size2(){
	super();
	System.out.println("hi");
	}
}
public class Supercons {
public static void main(String[] args) {
	Size2 obj = new Size2();
}
}
