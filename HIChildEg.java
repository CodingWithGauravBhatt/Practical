package Class;
class Employee{
	int salary = 10000;
	int bonus = 1500;
	void action () {
		int updated_salary=salary+bonus;
		System.out.println(updated_salary);
	}
}
class Engineer extends Employee{
	int Benifits=100;
}
class Doctor extends Employee{
	int da=500;
}
public class HIChildEg {
	public static void main(String[] args) {
Engineer e = new Engineer();
System.out.println(e.salary+" "+e.Benifits+" "+"incremented salary of Engineer");
e.action();
Doctor d = new Doctor();
System.out.println(d.salary+" "+d.da+" "+"incremented salary of Doctor");
d.action();
	}
}
