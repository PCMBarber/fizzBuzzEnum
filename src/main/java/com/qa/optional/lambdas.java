package com.qa.optional;

public enum lambdas implements FuncInterface {
	
	FIZZ((int x) -> {if (x % 3 == 0) System.out.print(" Fizz");}),
	BUZZ((int x) -> {if (x % 5 == 0) System.out.print(" Buzz");});
	
	private FuncInterface funcInterface;
	
	lambdas(final FuncInterface funcInterface) {
		this.funcInterface = funcInterface;
	}
	
	@Override
	public void operation(int a) {
		funcInterface.operation(a);
	}
}

