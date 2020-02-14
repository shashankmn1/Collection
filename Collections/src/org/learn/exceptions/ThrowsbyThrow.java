package org.learn.exceptions;

import javax.security.sasl.SaslException;

public class ThrowsbyThrow {

	public static void main(String[] args) throws Exception {
		int i;
		for(i=0;i<=5;i++)
		{
			if(i<=4){
				System.out.println("Value of i:"+i);
			}else{
				throw new SaslException("i:"+i+" Must not Exceed "+(i-1));
			}
		}
		
		System.out.println("Throw");

	}
}