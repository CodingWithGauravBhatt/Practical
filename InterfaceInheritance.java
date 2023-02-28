package Today28Feb;
interface Parent {
	void show();
}
interface child extends Parent{
	void display();
}
class child1 implements child{

	@Override
	public void show() {
		System.out.println("Parent Interface Method");
		
	}

	@Override
	public void display() {
		System.out.println("Child Interface Method");
		
	}
	
}
public class InterfaceInheritance {
public static void main(String[] args) {
	child1 obj = new child1();
	obj.display();
	obj.show();
}
}
