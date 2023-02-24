package Today24Feb;

 class Finalmethod {
	final void display() { //create a final method
		System.out.println("This is a final method.");
		}}
		class Child extends Finalmethod{ //child class name Main
	// try to override finalmethod
//			public final void display() {
//				System.out.println("The Finalmethod is Overridden");
		}
	public class Finalmethod1{ //Main class
		public static void main(String[] args) {
			Child obj = new Child();
			obj.display();
		}}