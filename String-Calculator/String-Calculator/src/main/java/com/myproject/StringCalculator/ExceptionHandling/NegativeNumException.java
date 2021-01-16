package com.myproject.StringCalculator.ExceptionHandling;

public class NegativeNumException extends Exception{
	
	public NegativeNumException(String[] numbers) 
	{
		
		System.out.print("Negatives not allowed :");
		for(String num:numbers)
		if(Integer.parseInt(num)<0)
			System.out.print(num+" ");
	}

}
