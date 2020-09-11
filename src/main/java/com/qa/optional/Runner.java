package com.qa.optional;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 200; i++) {
			System.out.print(i);
	    	lambdas.FIZZ.operation(i);
	    	lambdas.BUZZ.operation(i);
	    	System.out.println();
		}
		
	}
}
