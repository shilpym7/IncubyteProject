package com.myproject.StringCalculator;

public class StringCalculator {

     public int Add(String numbers)
		{
			
			if(numbers.isEmpty() || numbers.equals(""))
			  return 0;

			int sum=0;
			String[] num=numbers.split(",|\\n");
			
			for(String str:num)
				sum+=Integer.parseInt(str);
			
			return sum;
		}
	}


