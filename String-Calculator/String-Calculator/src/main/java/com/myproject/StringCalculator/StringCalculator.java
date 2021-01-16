package com.myproject.StringCalculator;

public class StringCalculator {

     public int Add(String numbers)
		{
			
			if(numbers.isEmpty() || numbers.equals(""))
			  return 0;
			
			int sum=0;
			if(!numbers.contains(","))
				return Integer.parseInt(numbers);
			sum=Integer.parseInt(numbers.substring(0, 1))+ Integer.parseInt(numbers.substring(2));
			
			
			return sum;
		}
	}


