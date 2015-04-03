package com.mkarasz.hw6.simpleText;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SimpleText {

	public static void main(String[] args) {
		ReadFile file = new ReadFile();
				
		printStrings(Word.shortestWords(file.getWordList()), "short.txt");
		printStrings(Word.longestWords(file.getWordList()), "long.txt");
		printStrings(Word.beginAndEndSameLetter(file.getWordList()), "same.txt");
		
		printStats(file.getWordList(), "statistics.txt");
		
	}
	
	private static void printStrings(ArrayList<String> list, String fileName) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			System.out.println("Something went wrong when opening " + fileName + " for writing.");
			e.printStackTrace();
			System.exit(-1);
		}
		
		for(String i : list) {
			pw.println(i);
		}
		pw.flush();
		pw.close();
	}
	
	private static void printStats(ArrayList<String> list, String fileName) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			System.out.println("Something went wrong when opening " + fileName + " for writing.");
			e.printStackTrace();
			System.exit(-1);
		}
		
		pw.println("The length of the shortest word is " + Word.shortestWordLength(list));
		pw.println("The length of the longest word is " + Word.longestWordLength(list));
		pw.println("The average length of a word is " + Word.averageLength(list));
		pw.println("The total number of words is " + Word.totalNumWords(list));
		printLetterFrequency(pw, Word.letterFrequency(list));
		pw.println(Word.frequencyProperWords(list) + "% of words are proper.");
		printLetterStartsWithFrequency(pw, Word.beginWithLetters(list));
		
	}
	
	private static void printLetterFrequency(PrintWriter pw, ArrayList<Double> list) {
		pw.println("Total letter frequency is as follows: ");
		pw.println("\tA: " + list.get(0) + "%");
		pw.println("\tB: " + list.get(1) + "%");
		pw.println("\tC: " + list.get(2) + "%");
		pw.println("\tD: " + list.get(3) + "%");
		pw.println("\tE: " + list.get(4) + "%");
		pw.println("\tF: " + list.get(5) + "%");
		pw.println("\tG: " + list.get(6) + "%");
		pw.println("\tH: " + list.get(7) + "%");
		pw.println("\tI: " + list.get(8) + "%");
		pw.println("\tJ: " + list.get(9) + "%");
		pw.println("\tK: " + list.get(10) + "%");
		pw.println("\tL: " + list.get(11) + "%");
		pw.println("\tM: " + list.get(12) + "%");
		pw.println("\tN: " + list.get(13) + "%");
		pw.println("\tO: " + list.get(14) + "%");
		pw.println("\tP: " + list.get(15) + "%");
		pw.println("\tQ: " + list.get(16) + "%");
		pw.println("\tR: " + list.get(17) + "%");
		pw.println("\tS: " + list.get(18) + "%");
		pw.println("\tT: " + list.get(19) + "%");
		pw.println("\tU: " + list.get(20) + "%");
		pw.println("\tV: " + list.get(21) + "%");
		pw.println("\tW: " + list.get(22) + "%");
		pw.println("\tX: " + list.get(23) + "%");
		pw.println("\tY: " + list.get(24) + "%");
		pw.println("\tZ: " + list.get(25) + "%");
	}
	
	private static void printLetterStartsWithFrequency(PrintWriter pw, ArrayList<Integer> list) {
		pw.println("The number of words that start with the same letter are as follows:");
		pw.println("\tA: " + list.get(0));
		pw.println("\tB: " + list.get(1));
		pw.println("\tC: " + list.get(2));
		pw.println("\tD: " + list.get(3));
		pw.println("\tE: " + list.get(4));
		pw.println("\tF: " + list.get(5));
		pw.println("\tG: " + list.get(6));
		pw.println("\tH: " + list.get(7));
		pw.println("\tI: " + list.get(8));
		pw.println("\tJ: " + list.get(9));
		pw.println("\tK: " + list.get(10));
		pw.println("\tL: " + list.get(11));
		pw.println("\tM: " + list.get(12));
		pw.println("\tN: " + list.get(13));
		pw.println("\tO: " + list.get(14));
		pw.println("\tP: " + list.get(15));
		pw.println("\tQ: " + list.get(16));
		pw.println("\tR: " + list.get(17));
		pw.println("\tS: " + list.get(18));
		pw.println("\tT: " + list.get(19));
		pw.println("\tU: " + list.get(20));
		pw.println("\tV: " + list.get(21));
		pw.println("\tW: " + list.get(22));
		pw.println("\tX: " + list.get(23));
		pw.println("\tY: " + list.get(24));
		pw.println("\tZ: " + list.get(25));
	}
	
}
