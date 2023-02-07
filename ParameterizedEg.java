package Class;

public class ParameterizedEg {
	
	int no;
	String month;
	// Parameterized cons where we have to pass the parameter / arguments
	ParameterizedEg (int a,String b){
		no =a;
		month =b;	
	}
	void show() {
		System.out.println(no + " " + month);
	}
	public static void main(String[] args) {
	Parameterizedcons d=new Parameterizedcons(1,"Jan");
	Parameterizedcons d1=new Parameterizedcons(2,"Feb");
	Parameterizedcons d2=new Parameterizedcons(3,"Mar");
	Parameterizedcons d3=new Parameterizedcons(4,"Apr");
	Parameterizedcons d4=new Parameterizedcons(5,"May");
	Parameterizedcons d5=new Parameterizedcons(6,"June");
	Parameterizedcons d6=new Parameterizedcons(7,"July");
	Parameterizedcons d7=new Parameterizedcons(8,"Augt");
	Parameterizedcons d8=new Parameterizedcons(9,"Sep");
	Parameterizedcons d9=new Parameterizedcons(10,"Oct");
	Parameterizedcons d10=new Parameterizedcons(11,"Nov");
	Parameterizedcons d11=new Parameterizedcons(12,"Dec");
	d.show();
	d1.show();
	d2.show();
	d3.show();
	d4.show();
	d5.show();
	d6.show();
	d7.show();
	d8.show();
	d9.show();
	d10.show();
	d11.show();
	}
	}

