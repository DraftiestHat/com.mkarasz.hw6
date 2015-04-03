package com.mkarasz.hw6.simpleText;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class WordTest {

	ArrayList<String> list;
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("rappar");
		list.add("teat");
		list.add("Beeb");
		list.add("abccbA");
		list.add("freaf");
		list.add("BasesesaB");
		list.add("Frankfurt");
	}

	@Test
	public void testShortestWordLength() {
		if(Word.shortestWordLength(list) != 4) {
			fail("Ya done screwed up shortest.");
		}
	}

	@Test
	public void testLongestWordLength() {
		if(Word.longestWordLength(list) != 9) {
			fail("Ya done screwed up longest.");
		}
	}

	@Test
	public void testShortestWords() {
		ArrayList<String> tmp = Word.shortestWords(list);
		if(tmp.contains("teat") == false) {
			fail("You didn't get the teat.");
		}
		if(tmp.contains("Beeb") == false) {
			fail("You didn't get the teat.");
		}
	}

	@Test
	public void testLongestWords() {
		ArrayList<String> tmp = Word.longestWords(list);
		if(tmp.contains("BasesesaB") == false) {
			fail("You didn't get the teat.");
		}
		if(tmp.contains("Frankfurt") == false) {
			fail("You didn't get the teat.");
		}
	}

	@Test
	public void testAverageLength() {
		if(Word.averageLength(list) != 6) {
			fail("Check my number.");
		}
	}

	@Test
	public void testTotalNumWords() {
		if(Word.totalNumWords(list) != 7) {
			fail("Woooow.");
		}
	}

	@Test
	public void testLetterFrequency() {
		ArrayList<Double> doubles = Word.letterFrequency(list);
		if(doubles.get(0) != (9.0 / 43.0)  * 100){
			System.out.println("" + doubles.get(0));
			fail("A's weren't right.");
		}
		if(doubles.get(1) != (6.0 / 43.0)  * 100 ){
			fail("B's weren't right.");
		}
		if(doubles.get(2) != (2.0 / 43.0)  * 100 ){
			fail("C's weren't right.");
		}
		if(doubles.get(4) != (6.0 / 43.0)  * 100 ){
			fail("E's weren't right.");
		}
		if(doubles.get(5) != (4.0 / 43.0)  * 100 ){
			fail("F's weren't right.");
		}
		if(doubles.get(10) != (1.0 / 43.0)  * 100){
			fail("K's weren't right.");
		}
		if(doubles.get(13) != (1.0 / 43.0)  * 100 ){
			fail("N's weren't right.");
		}
		if(doubles.get(15) != (2.0 / 43.0)  * 100 ){
			fail("P's weren't right.");
		}
		if(doubles.get(17) != (5.0 / 43.0)  * 100 ){
			fail("R's weren't right.");
		}
		if(doubles.get(18) != (3.0 / 43.0)  * 100){
			fail("S's weren't right.");
		}
		if(doubles.get(19) != (3.0 / 43.0)  * 100){
			fail("T's weren't right.");
		}
		if(doubles.get(20) != (1.0 / 43.0)  * 100){
			fail("U's weren't right.");
		}
		
	}

	@Test
	public void testFrequencyProperWords() {
		double freq = Word.frequencyProperWords(list);
		//System.out.println("freq " + freq);
		if(freq != (3.0 / 7.0) * 100){
			fail("Frequency.");
		}
	}

	@Test
	public void testBeginWithLetters() {
		ArrayList<Integer> begin = Word.beginWithLetters(list);
		if(begin.get(0) != 1) {
			fail("Whats.");
		}
		if(begin.get(1) != 2) {
			fail("What.");
		}
		if(begin.get(5) != 2){
			fail("You suck.");
		}
		if(begin.get(17) != 1){
			fail("You suck.");
		}
		if(begin.get(19) != 1){
			fail("You suck.");
		}
	}

	@Test
	public void testBeginAndEndSameLetter() {
		ArrayList<String> bAndE = Word.beginAndEndSameLetter(list);
		list.add("rappar");
		list.add("teat");
		list.add("Beeb");
		list.add("abccbA");
		list.add("freaf");
		list.add("BasesesaB");
		if(bAndE.contains("rappar") == false) {
			fail("R's");
		}
		if(bAndE.contains("teat") == false) {
			fail("T's");
		}
		if(bAndE.contains("Beeb") == false) {
			fail("B's");
		}
		if(bAndE.contains("abccbA") == false) {
			fail("A's");
		}
		if(bAndE.contains("BasesesaB") == false) {
			fail("B's");
		}
		
	}

}
