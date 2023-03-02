package Today2Mar;

public class ArrayEg2 {
	public static void main(String[] args) {
int a[]=new int[5];
a[0]=1;
a[1]=3;
a[2]=5;
a[3]=2;
a[4]=6;
//traversing an array(printing one after NOTHER) an arry using for each loop
			for(int i:a)
				System.out.println(i);
		//	for(int i=0; i<a.length;i++) // length is one of the property of an array
			//	System.out.println(a[i]);
}
}