package MyPackage;

public class Write_Encap {
private String name="My Name Antheni";
public void setName() {
	this.name=name;
}
public static void main(String[] args) {
	Write_Encap obj = new Write_Encap();
	// we can not get the value,there is no get method
	// System.out.println("Name:"+obj.getName());
	System.out.println(obj.name);
}
}
