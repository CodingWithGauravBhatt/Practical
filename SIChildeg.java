package Class;
class SIParenteg{// parent class
	int salary = 30000; // parent class member
}
public class SIChildeg extends SIParenteg {
int bonus = 1500; // child class member
int annualsal = salary + bonus;
public static void main(String[] args) {
	SIChildeg object = new SIChildeg();
	System.out.println("Salary is:"+object.salary);
	System.out.println("Salary is:"+object.annualsal);
}
}
