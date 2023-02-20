package Class;
class Shape1{
	void print() {
		System.out.println("Print Cicle");
	}
}
class Size1 extends Shape1{
void print() {
	System.out.println("Print Triangle");
}
void display() {
	System.out.println("Print Nothing");
}
	void show()	{
		super.print();
		display();
		print();
	
	}
}
public class SuperMethod {
	public static void main(String[] args) {
		
Size1 obj = new Size1();
obj.show();
}}
