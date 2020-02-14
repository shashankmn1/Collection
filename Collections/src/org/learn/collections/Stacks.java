package org.learn.collections;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
	public Stacks(){  
		long st=System.nanoTime();
		Stack<Object> stack = new Stack<>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop(); 
		stack.push(1);
		Iterator<Object> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		long et=System.nanoTime();
		int tt=(int) (et-st);
		System.out.println("Stacks:"+tt);
	}  
}