package Today28Feb;
interface NewEmployee{
	void salary();
}
interface NewDeveloper{
	void salary();
}
class NewTrainer implements NewEmployee,NewDeveloper{
	@Override
	public void salary() {
		System.out.println("WOW Salary Increamented");		
	}
}
public class MIInterfaceEg2 {
public static void main(String[] args) {
	NewTrainer obj = new NewTrainer();
	obj.salary();
}
}
