package Class;

public class DifferentClassname {
int age;
String name;
void show() {
	System.out.println(age+" "+name);
}
public static void main(String[] args) {
	// 1st object for age & name
	DifferentClassname d = new DifferentClassname();
	// 2nd object for age & name
		DifferentClassname d1 = new DifferentClassname();
		d.show();
		d1.show();
			DifferentClassname d3 = new DifferentClassname();
			d3.age=100;
			d3.name="JAVA";
			System.out.println(d3.age+d3.name);
}
}
