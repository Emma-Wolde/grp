package packcolle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declare ArrayList
		//ArrayList a1 = new ArrayList (); //hetro 
		//ArrayList <Integer> a2 = new ArrayList <Integer>();  //homogeneous
		//ArrayList <String> a3 = new ArrayList <String> ();   //homo
		//List a4 = new ArrayList ();    // list parent interface we can create reference variable and create arraylist object
	
		int [] a = new int[4];
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		for(int n : a){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(a));//Arrays.toString(arrayname)
		
		
		ArrayList a1 = new ArrayList ();
		a1.add("noah");
		a1.add("noa");
		a1.add("no");
		a1.add("eli");
		a1.add(7);
		a1.add(21);
		
		System.out.println(a1);
		System.out.println(a1.size());
		a1.remove(3);
		System.out.println(a1);
		System.out.println(a1.size());
		
		ArrayList uu = new ArrayList ();
		uu.addAll(a1);
		System.out.println(uu);
		System.out.println(uu.size());
		
	}
	
	
	

}
