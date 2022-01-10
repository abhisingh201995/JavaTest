package com.abhishek.LeetCode_Test;

public class TwoSumBruteForce {

	static int[] nums = { 2, 7, 11, 15 };

	static int target = 9;

	public int[] twoSum(int[] nums, int target) {

		int result;

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				result = nums[i] + nums[j];

				if (result == target) {

					return new int[] { i, j };
				}

			}

		}

		return new int[2];
	}

	public static void main(String[] args) {
		
		TwoSumBruteForce sol = new TwoSumBruteForce();
		sol.twoSum(nums, target);
	}

}
