package com.m2i.devops;

public class Calculator {
	public int  add(int a, int b) {
		return a+b;
	}

	public int  mult(int a, int b) {
		return a*b;
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public int mod(int a, int b) {
		return a%b;
	}
	
	public boolean isEven(int a) {
		return mod(a, 2) == 0;
	}
}
