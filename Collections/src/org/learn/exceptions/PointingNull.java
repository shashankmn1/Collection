package org.learn.exceptions;

public class PointingNull {

	public static void main(String[] args) throws Exoption {
		
		int a[]=new int[5];
		
		for(int i=1;i<5;i++){
			a[i]=i;
		}
		
		for(int i=1;i<=5;i++){
			try{
			if(a[i]<4){
				System.out.println("A[]: "+a[i]);
			}}
			 catch (Exception e) {
					System.out.println("Catch block");
					throw new ArithmeticException("hello");
				}
		}
	}
}