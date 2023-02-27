package Today27Feb;

public class StaticBinding {
	private void display() {
		System.out.println("Something");
	}
public static void main(String[] args) {
	StaticBinding obj = new StaticBinding();
	obj.display();
}
}
