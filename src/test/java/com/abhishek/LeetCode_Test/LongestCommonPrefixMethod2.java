package com.abhishek.LeetCode_Test;

public class LongestCommonPrefixMethod2 {

	static String strs[] = { "flow", "flower", "flow", "flight", "float" };
	static String prefix = strs[0];
	
	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 0)
			return "";

		System.out.println(strs.length);

		String prefix = strs[0];
		System.out.println(prefix);

		int length = strs[0].length();
		System.out.println(length);

		for (int i = 1; i < strs.length; i++) {

			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";

			}
		}
		System.out.println(prefix);
		return prefix;

	}

	public static void main(String[] args) {
		longestCommonPrefix(strs);
	}

}
