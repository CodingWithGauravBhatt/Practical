package Today28Feb;
interface ParentInterface{
	void show();
default void print() {
	System.out.println("Default Method");
}
 static void display(){
	System.out.println("Static Method");
	}
}
class Interface implements ParentInterface {

	@Override
	public void show() {
		System.out.println("Parent Interface Method");
	}
	public static void main(String[] args) {
		Interface Object = new Interface();
		Object.show();
		ParentInterface.display();
		Object.print();
	}

}
