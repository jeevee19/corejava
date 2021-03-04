package com.capg.corejava.lambdaExpressions;

public class LambdaDemo {
   public static void main(String[]args)
   {
	   MyInterface mi = (a, b) -> {return a+b;}; //lambda exprsn
	   System.out.println(mi.add(5,5));
   }
}
