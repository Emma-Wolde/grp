package packcolle;

import java.util.*;
import java.util.Iterator;
public class Instantiation {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * List <data-type> list1= new ArrayList();
		 * 
		 * List <data-type> list2 = new LinkedList();
		 * 
		 * List <data-type> list3 = new Vector();
		 * 
		 * List <data-type> list4 = new Stack();
		 * 
		 */
		LinkedList<Object> list1 = new LinkedList<>();
		List <Object> list2= new LinkedList<>();
		Collection <Object> list3= new LinkedList<>();
		
		list1.add(11);
		list1.add("uyu11");
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add("lily1");
		
		
		list2.add(22);
		list2.add(22);
		
		list3.add(33);
		list3.add(33);
		
		List <Object> list11 = new Vector<>();   
	
		list11.addAll(list1);
		
		System.out.println(list1+"\n");
		System.out.println(list1.size()+"\n");
		System.out.println(list1.indexOf(166)+"\n");
		Iterator<Object>itr= list1.iterator();  
//		while(itr.hasNext())
//		{  System.out.println(itr.next()); }
//		
		for(Iterator<Object> it1 = list11.iterator(); it1.hasNext();)
			System.out.println(it1.next());
			System.out.println(" This is using iterator (for)method ");
			
			for (int a =0;a < list11.size(); a++)
				
			{   System.out.print(list11.get(a) +"  ");}
			 System.out.print("iterate using for loop ");
//		System.out.println(list2);
//		System.out.println(list3);
//		
		//iterartion.. enhanced for loop, iterator method, foreach
		List <Object>  list4 = new LinkedList<>(Arrays.asList(1,"mom","mam","mami",12,16,21));  
				System.out.println("This is list 4 "+list4+"\n");
				for(Object o:list4) {
					System.out.println(o);
				}

		List <Object> list5 = new LinkedList<>();   
			 //list5.addAll(list4,list1);
			list5.addAll(list4);
			System.out.println("This is list 5 "+list5+"\n");
//		List  list4 = new Stack();   
}
}