package com.abhishek.LeetCode_Test;

/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000 For example, 2 is written
 * as II in Roman numeral, just two one's added together. 12 is written as XII,
 * which is simply X + II. The number 27 is written as XXVII, which is XX + V +
 * II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed
 * before L (50) and C (100) to make 40 and 90. C can be placed before D (500)
 * and M (1000) to make 400 and 900. Given a roman numeral, convert it to an
 * integer.
 */

public class RomanToInteger {
	static int res = 0;
	public static int romanToInt(String s) {

		s = s.replace("IV", "IIII");
		s = s.replace("IX", "IIIIIIIII");
		s = s.replace("XL", "XXXX");
		s = s.replace("XC", "XXXXXXXXX");
		s = s.replace("CD", "CCCC");
		s = s.replace("CM", "CCCCCCCCC");

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
				case 'M':
					res += 1000;
					break;
				case 'C':
					res += 100;
					break;
				case 'X':
					res += 10;
					break;
				case 'V':
					res += 5;
					break;
				case 'L':
					res += 50;
					break;
				case 'D':
					res += 500;
					break;
				case 'I':
					res += 1;
					break;

			}

		}
		return res;
	}

	public static void main(String[] args) {
		RomanToInteger.romanToInt("VIII");
		System.out.println(res);
	}
}
