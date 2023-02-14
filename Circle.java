package Class;
class AggregationEg{
	int sqare(int r) {
		return r*r;
	}
}
public class Circle {
AggregationEg ref_var;
double pi =3.14;
double area (int radius) {
	ref_var=new AggregationEg();
	int psquare=ref_var.sqare(radius);
	return pi*psquare;
}
public static void main(String[] args) {
	Circle c =new Circle();
	double result =c.area(5);
	System.out.println("Area is :"+result);
}
}
