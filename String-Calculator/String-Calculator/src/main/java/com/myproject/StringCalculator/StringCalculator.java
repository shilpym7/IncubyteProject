package com.myproject.StringCalculator;

public class StringCalculator {

     public int Add(String numbers)
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
				sum+=Integer.parseInt(str);
			
			return sum;
		}
	}


