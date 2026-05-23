
package com.pu.junit;

public class AddTwoNumber 
{	public int add(int a, int b) 
{        return a + b ;    }
    public int subtract(int b, int c)
 {        return b - c;    }
    public int Multiplication(int b, int c)
    {        return b*c;    }
    public int div(int a, int c)
    {        return a/ c;    }
public static void main(String[] args)
 {	AddTwoNumber calc = new AddTwoNumber();
   	 int result1 = calc.add(2, 3);
 	   int result2 = calc.subtract(2, 3);
 	    int result3=calc.Multiplication(2, 3);
 	      int result4=calc.div(6, 3);
 	     
 	   System.out.println("Result: " + result1);
   	 System.out.println("Result: " + result2);
   	 System.out.println("Result: " + result3);
   	 System.out.println("Result: " + result4);
}
}
