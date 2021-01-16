package com.myproject.StringCalculator;

import com.myproject.StringCalculator.ExceptionHandling.NegativeNumException;

public class StringCalculator {

     public int Add(String numbers) throws NegativeNumException
		{
			
			if(numbers.isEmpty() || numbers.equals(""))
			  return 0;

			int sum=0;
			String delimiter=",|\\n";
			String newstr=numbers;
			if(numbers.length()>=5)
			{
			if(numbers.substring(0,2).equals("//"))
			{
				  delimiter = numbers.substring(2,numbers.indexOf("\n"))+"|\\n";
				  newstr=numbers.substring(numbers.indexOf("\n")+1);
			}
			}
			String[] num=newstr.split(delimiter);
             
			for(String str:num)
			{
				try {
				if(Integer.parseInt(str)>0)
					sum+=Integer.parseInt(str);
				}
				catch(Exception ex)
				{
					throw new NegativeNumException(num);
				}
		}
				
			
			return sum;
		}
	}


