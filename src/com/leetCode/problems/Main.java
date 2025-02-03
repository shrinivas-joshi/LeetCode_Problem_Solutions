package com.leetCode.problems;

import com.leetCode.problems.palindromCheck.PalindromeCheckImplementation;
import com.leetCode.problems.twoSum.TwoSumImplementation;

public class Main {

	public static void main(String[] args) {
	
		TwoSumImplementation implementation = new TwoSumImplementation();
		System.out.print(implementation.twoSum(new int[]{2,7,11,15},9));
		
		
		PalindromeCheckImplementation palindromeCheckImplementation = new PalindromeCheckImplementation();
		System.out.println( palindromeCheckImplementation.isPalindrome(121));
		System.out.println( palindromeCheckImplementation.isPalindrome(-121));
		System.out.println( palindromeCheckImplementation.isPalindrome(10));
	}

}
