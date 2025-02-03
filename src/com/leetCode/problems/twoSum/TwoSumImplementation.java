package com.leetCode.problems.twoSum;

import java.util.ArrayList;

public class TwoSumImplementation {
	public int[] twoSum(int[] nums, int target) {
		int[] answers = new int[2];
		ArrayList<Integer> seen = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int value = target - nums[i];
			if (seen.contains(value)) {
				answers = new int[] { i, seen.indexOf(value) };
				return answers;
			} else {
				seen.add(nums[i]);
			}
		}
		return answers;
	}

}
