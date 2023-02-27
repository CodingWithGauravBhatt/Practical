package Today27Feb;
abstract class Testabstract{
	abstract void dispaly();
	
	void show() {
		System.out.println("non abstract method invoked");
	}
}
class Demo1 extends Testabstract{
	void display() {
		System.out.println("Demo1 Method invoked");
	}

	@Override
	void dispaly() {
		// TODO Auto-generated method stub
		
	}
}
class Demo2 extends Testabstract{
	void display() {
		System.out.println("Demo2 Method invoked");
	}

	@Override
	void dispaly() {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractMethod {
	public static void main(String[] args) {
		Demo1 Child1 =new Demo1();
		Demo2 Child2 =new Demo2();
		Child1.display();
		Child2.display();
		Child2.show();
	}
}
