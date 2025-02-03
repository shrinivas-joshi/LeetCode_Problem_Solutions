package com.leetCode.problems.palindromCheck;

public class PalindromeCheckImplementation {
	
	public boolean isPalindrome(int x) {
		int reverse = 0;
		int temp = x;
		
		if (x < 0) {
			return false;
		} 
		while (temp!=0) {
			int remainder = temp % 10;
			reverse = remainder * 10 + remainder;
			temp = temp/10;
		}
		return reverse == x;
		
	}

}
