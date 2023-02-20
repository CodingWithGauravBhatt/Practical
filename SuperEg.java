package Class;
class Shape {
	String name="Circle";
}
class size extends Shape{
	String name = "No Size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperEg {
public static void main(String[] args) {
	size obj=new size();
	obj.print();
}
}
