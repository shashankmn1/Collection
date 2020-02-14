package org.learn.collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
	public Vectors(){  
		long st=System.nanoTime();
		Vector<Object> v=new Vector<>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");
		v.add(1);
		Iterator<Object> itr=v.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		long et=System.nanoTime();
		int tt=(int) (et-st);
		System.out.println("Vectors:"+tt);
	}  
}