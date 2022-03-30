package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	String result=Integer.toString(num);
		if (num %3 ==0 && num %5 ==0) {
			result = "Fizzbuzz";
		}
		else if (num%3 ==0) {
			result = "Fizz";
		}
		else if (num%5 ==0) {
			result = "Buzz";
		}
        return result;
	}
	
	String processNumbers (int[] nums)
	{
    	String result = "";
        
        for (int i= 0;i < nums.length; i++) {
        	if (i != nums.length -1) {
        		result += processNumber(nums[i]) + ", ";
        	}
        	else {
        		result += processNumber(nums[i]);
        	}
        	
        }
        return result;
	}

}
