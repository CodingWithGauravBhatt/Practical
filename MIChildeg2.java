package Class;
class MLIParentEg3{
	int salary = 30000;
}
class MIChildeg1 extends MLIParentEg3{
	int bonus = 1500;
	int annualsal=salary+bonus;
}
class MIChildeg2 extends MIChildeg1{
	int da = 200;
	int totalsal=annualsal+da;
	
public static void main (String[]args) {
MIChildeg2 object = new MIChildeg2();
System.out.println("Salary is :"+object.salary);
System.out.println("Annual Salary is :"+object.annualsal);
System.out.println("Total Salary is :"+object.totalsal);
}
}
