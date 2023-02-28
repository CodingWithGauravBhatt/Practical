package Today28Feb;
interface Employee{
	void salary();
}
interface Developer{
	void Bonus();
}
class Trainer implements Employee,Developer{

	@Override
	public void Bonus() {
		System.out.println("Bonus will be 10% of Salary");
		
	}

	@Override
	public void salary() {
		System.out.println("Salary Increamented");
		
	}
	
}
public class MIInterfaceEg1 {
public static void main(String[] args) {
	Trainer obj = new Trainer();
	obj.Bonus();
	obj.salary();
}
}
