package com.mkarasz.hw6.simpleText;

import java.util.ArrayList;

/** Implements palindromic ideas.
 * @author Matt
 *
 */
public final class Palindrome {
	/** Takes a word and determines if it's a palindrome
	 * @param word the word to test
	 * @return if the word is (true) or isn't (false)
	 */
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
	
	/** Takes an ArrayList of Strings, tests, and returns a different ArrayList of the ones that are palindromes
	 * @param list the strings to test if they're palindromes
	 * @return a list of palindromes
	 */
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
