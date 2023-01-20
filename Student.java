class Student1{ // defining a student class
int slno; // defining field/ data member/ Instance
String name;

}

class Student{


public static void main(String...args){ // method of student class




Student1 s = new Student1(); // creating a object
s.slno = 01;
s.name = "pallabi";


System.out.println(s.slno);
System.out.println(s.name);

s.slno = 2;
s.name = "sita";

System.out.println(s.slno);
System.out.println(s.name);

}
}