package com.m2i.devops;

/**
 * @author Administrateur
 *
 */
public class Calculator {
  
  
  /**
   * Add two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public int  add(int leftVal, int rightVal) {
    return leftVal+rightVal;
  }

  /**
   * Add two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public int  mult(int a, int b) {
    return a*b;
  }

  /**
   * Add two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public int sub(int a, int b) {
    return a-b;
  }

  /**
   * Add two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public int mod(int a, int b) {
    return a%b;
  }

  /**
   * Add two numbers
   * 
   * @param a
   * @param b
   * @return
   */
  public boolean isEven(int a) {
    return mod(a, 2) == 0;
  }

  public String getPrimeNumber(int max)
  {		
    int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";

    for (i = 1; i <= max; i++)         
    { 		  	  
      int counter=0; 	  
      for(num =i; num>=1; num--)
      {
        if(i%num==0)
        {
          counter = counter + 1;
        }
      }
      if (counter ==2)
      {
        //Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
      }
    }
    return primeNumbers;
  }
}
