package Today7Apr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethodEg{
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Gautam");
		a1.add("Sourav");
		a1.add("Manish");
		a1.add("Himanshu");
		a1.add("Mahesh");
		a1.add("gourav");
		
		Collections.sort(a1);
		System.out.println("Traversing using for loop");
		for(String name:a1) {
			System.out.println(name);
		}		
		String element =a1.get(2);  // get()method ArrayListMethod_Eg
		System.out.println("Get index : "+ element);
		System.out.println("Array List is : "+a1.isEmpty());  // isEmpty()
		String element1 = a1.remove(4);  // remove()
		System.out.println("Remove index : "+ element1);
		System.out.println("traversing using for loop");
		for(int i = 0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}		
	}
}