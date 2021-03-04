package com.capg.corejava.lambdaExpressions;

public class Main {
   public static void main(String[] args)
   {
	   Multiplyinterface mmi = (a,b)->{return a*b;};
	   System.out.println(mmi.mul(5, 5));
   }
}
