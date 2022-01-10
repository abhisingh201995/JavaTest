package com.abhishek.LeetCode_Test;

public class LongestCommonPrefix {

	static String strs[] = { "flow", "flower", "flow", "flight", "float" };
	static String prefix = strs[0];
	
	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0)
			return "";

		int length = strs[0].length();
		System.out.println(length);

		for (int i = 1; i < strs.length; i++) {
			length = Math.min(length, strs[i].length());

			System.out.println("lenth is" + length);

			for (int j = 1; j < length; j++) {
				char c = strs[0].charAt(j), d = strs[i].charAt(j);

				if (c != d) {
					length = j;
					System.out.println("len is" + length);
					break;
				}
			}
		}
		return strs[0].substring(0, length);
	}

	public static void main(String[] args) {
		longestCommonPrefix(strs);
	}

}
