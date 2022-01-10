package com.abhishek.LeetCode_Test;

import java.util.HashMap;
import java.util.Map;

public class TwoPassHashMapTwoSum {

	static int nums[] = { 2, 7, 11, 15 };
	static int target = 9;

	Map<Integer, Integer> map = new HashMap<>();

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
				return new int[] { i, map.get(target - nums[i]) };
			}
		}

		return new int[2];

	}

	public static void main(String[] args) {

		TwoPassHashMapTwoSum sol = new TwoPassHashMapTwoSum();
		sol.twoSum(nums, target);
	}

}
