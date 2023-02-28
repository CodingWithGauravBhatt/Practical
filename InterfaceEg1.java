package Today28Feb;
interface Shape{
	void shape_name();
}
class Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a Circle");
			}
}
class Triangle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a Triangle");
	}
	}
public class InterfaceEg1 {
public static void main(String[] args) {
	Circle Obj=new Circle();
	Obj.shape_name();
}
}
