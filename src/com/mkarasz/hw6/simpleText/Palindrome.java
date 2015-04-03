package com.mkarasz.hw6.simpleText;

import java.util.ArrayList;

public final class Palindrome {
	public static boolean isPalindrome(String word) {
		int len = word.length();
		
		for(int i = 0; i < len/2; i++){
			if(word.substring(i, i + 1).equalsIgnoreCase(word.substring(len - i - 1, len - i))){
				;
			}
			else{
				return false;
			}
		}
		
		return true;
	}
	
	public static ArrayList<String> palindromes(ArrayList<String> list) {
		ArrayList<String> ret = new ArrayList<String>();
		
		for(String i : list) {
			if(isPalindrome(i)) {
				ret.add(i);
			}
		}
		
		return ret;
	}
	
}
