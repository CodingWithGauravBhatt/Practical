package Today27Feb;

public class DynamicBinding {
void show() {
	System.out.println("Is It Clear");
}
}
class Binding extends DynamicBinding{
	void show() {
		System.out.println("Override");
	}
public static void main(String[] args) {
	DynamicBinding obj = new DynamicBinding();
	obj.show();
}
}
