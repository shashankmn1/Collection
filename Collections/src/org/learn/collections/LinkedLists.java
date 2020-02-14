package org.learn.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	public LinkedLists(){  
		long st=System.nanoTime();
		LinkedList<Object> al=new LinkedList<>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay"); 
		al.add(1);
		Iterator<Object> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		long et=System.nanoTime();
		int tt=(int) (et-st);
		System.out.println("LinkedLists:"+tt);
	}  
}