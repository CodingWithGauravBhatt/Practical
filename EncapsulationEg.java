package MyPackage;

public class EncapsulationEg {
public static void main(String[] args) {
	Person p = new Person();
		p.setName("Gaurav");
		p.setAge(22);
		System.out.println("Name is:"+p.getName());	
		System.out.println("Age is:"+p.getAge());
}
}
