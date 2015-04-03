package com.mkarasz.hw6.simpleText;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	ArrayList<String> list;
	@Before
	public void setUpBeforeClass() throws Exception {
		list = new ArrayList<String>();
		list.add("rappar");
		list.add("teat");
		list.add("Beeb");
		list.add("abccbA");
		list.add("freaf");
		list.add("BasesesaB");		
	}

	@Test
	public void testIsPalindrome() {
		if(Palindrome.isPalindrome("Abccba") == false)
			fail("Check capitalization.");
		if(Palindrome.isPalindrome("BasesesaB") == false) {
			fail("check middle letters.");
		}
	}

	@Test
	public void testPalindromes() {
		ArrayList<String> tmp = Palindrome.palindromes(list);
		if(tmp.contains("rappar") == false) {
			fail("You've got real problems.");
		}
		if(tmp.contains("Beeb") == false) {
			fail("Still got capitalization issues?");
		}
		if(tmp.contains("abccbA") == false) {
			fail("Ending capitalization problems.");
		}
		if(tmp.contains("BasesesaB") == false) {
			fail("Even bigger issues.");
		}
		if(tmp.contains("freaf")) {
			fail("what.");
		}
		if(tmp.contains("teat")) {
			fail("what.");
		}
	}

}
