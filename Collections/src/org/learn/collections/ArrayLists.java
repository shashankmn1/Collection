package org.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
	public ArrayLists(){  
		long st=System.nanoTime();
		ArrayList<Object> list = new ArrayList<>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		list.add(1);
		//Traversing list through Iterator  
		Iterator<Object> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		long et=System.nanoTime();
		int tt=(int) (et-st);
		System.out.println("Arraylist:"+tt);
	}  
}