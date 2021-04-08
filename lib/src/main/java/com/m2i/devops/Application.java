package com.m2i.devops;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello W");

		Calculator calc = new Calculator();
		System.out.println("Add 2+3 : " + calc.add( 2, 3));
		System.out.println("Sub 2-3 : " + calc.sub( 2, 3));
		System.out.println("IsEven 4  : " + calc.isEven(4));

		System.out.println("Prime numbers from 1 to 100 are :" + calc.getPrimeNumber(15));

	}

}
