package com.mkarasz.hw6.simpleText;

import java.util.ArrayList;
import java.util.Collections;

public final class Word {
	public static int shortestWordLength(ArrayList<String> list) {
		int shortLength = list.get(0).length();
		int currentLength = 0;
		
		for(String i : list) {
			currentLength = i.length();
			if(currentLength < shortLength) {
				shortLength = currentLength;
			}
		}
		
		return shortLength;
	}
	
	public static int longestWordLength(ArrayList<String> list) {
		int shortLength = -1;
		int currentLength = 0;
		
		for(String i : list) {
			currentLength = i.length();
			if(currentLength > shortLength) {
				shortLength = currentLength;
			}
		}
		
		return shortLength;
	}
	
	public static ArrayList<String> shortestWords(ArrayList<String> list) {
		int shortLength = shortestWordLength(list);
		ArrayList<String> ret = new ArrayList<>();
		
		for(String i : list) {
			if(i.length() == shortLength) {
				ret.add(i);
			}
		}
		
		return ret;
	}
	
	public static ArrayList<String> longestWords(ArrayList<String> list) {
		int longLength = longestWordLength(list);
		ArrayList<String> ret = new ArrayList<>();
		
		for(String i : list) {
			if(i.length() == longLength) {
				ret.add(i);
			}
		}
		
		return ret;
	}
	
	public static int averageLength(ArrayList<String> list) {
		long totalLength = 0;
		int avg = 0;
		
		for(String i : list) {
			totalLength += i.length();
		}
		
		avg = (int) (totalLength / list.size());
		
		return avg;
	}
	
	public static int totalNumWords(ArrayList<String> list) {
		return list.size();
	}
	
	public static ArrayList<Double> letterFrequency(ArrayList<String> list) {
		ArrayList<String> letterList = new ArrayList<String>();
		ArrayList<Double> freqList = new ArrayList<Double>();
		
		for(String i : list){
			splitCharacters(i, letterList);
		}
		
		freqList.add(((double) Collections.frequency(letterList, "a") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "b") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "c") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "d") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "e") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "f") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "g") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "h") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "i") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "j") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "k") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "l") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "m") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "n") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "o") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "p") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "q") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "r") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "s") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "t") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "u") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "v") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "w") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "x") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "y") / (double) letterList.size()) * 100);
		freqList.add(((double) Collections.frequency(letterList, "z") / (double) letterList.size()) * 100);
		
		
		
		
		
		
		return freqList;
	}
	
	private static void splitCharacters(String i, ArrayList<String> list) {
		int len = i.length();
		String tmp = null;
		
		for(int j = 0; j < len; j++) {
			//System.out.println("j is " + j + " and the letter is " + i.substring(j, j+1));
			tmp = i.substring(j, j + 1);
			list.add(tmp.toLowerCase());
		}
	}
	
	public static double frequencyProperWords(ArrayList<String> list) {
		double proper = 0;
		
		for(String i : list) {
			if(stringIsProper(i)) {
				proper++;
			}
		}
		
		return (proper / list.size()) * 100;
	}
	
	private static boolean stringIsProper(String str) {
		return (str.startsWith("A") || str.startsWith("B") || str.startsWith("C") || str.startsWith("D") || str.startsWith("E") || str.startsWith("F") || str.startsWith("G") || str.startsWith("H") || str.startsWith("I") || str.startsWith("J") || str.startsWith("K") || str.startsWith("L") || str.startsWith("M") || str.startsWith("N") || str.startsWith("O") || str.startsWith("P") || str.startsWith("Q") || str.startsWith("R") || str.startsWith("S") || str.startsWith("T") || str.startsWith("U") || str.startsWith("V") || str.startsWith("W") || str.startsWith("X") || str.startsWith("Y") || str.startsWith("Z"));
	}
	
	public static ArrayList<Integer> beginWithLetters(ArrayList<String> list) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 26; i++){
			intList.add(i, 0);
		}
		
		for(String j : list) {
			if(j.startsWith("A") || j.startsWith("a"))
				intList.set(0, intList.get(0) + 1);
			else if(j.startsWith("B") || j.startsWith("b"))
				intList.set(1, intList.get(1) + 1);
			else if(j.startsWith("C") || j.startsWith("c"))
				intList.set(2, intList.get(2) + 1);
			else if(j.startsWith("D") || j.startsWith("d"))
				intList.set(3, intList.get(3) + 1);
			else if(j.startsWith("E") || j.startsWith("e"))
				intList.set(4, intList.get(4) + 1);
			else if(j.startsWith("F") || j.startsWith("f"))
				intList.set(5, intList.get(5) + 1);
			else if(j.startsWith("G") || j.startsWith("g"))
				intList.set(6, intList.get(6) + 1);
			else if(j.startsWith("H") || j.startsWith("h"))
				intList.set(7, intList.get(7) + 1);
			else if(j.startsWith("I") || j.startsWith("i"))
				intList.set(8, intList.get(8) + 1);
			else if(j.startsWith("J") || j.startsWith("j"))
				intList.set(9, intList.get(9) + 1);
			else if(j.startsWith("K") || j.startsWith("k"))
				intList.set(10, intList.get(10) + 1);
			else if(j.startsWith("L") || j.startsWith("l"))
				intList.set(11, intList.get(11) + 1);
			else if(j.startsWith("M") || j.startsWith("m"))
				intList.set(12, intList.get(12) + 1);
			else if(j.startsWith("N") || j.startsWith("n"))
				intList.set(13, intList.get(13) + 1);
			else if(j.startsWith("O") || j.startsWith("o"))
				intList.set(14, intList.get(14) + 1);
			else if(j.startsWith("P") || j.startsWith("p"))
				intList.set(15, intList.get(15) + 1);
			else if(j.startsWith("Q") || j.startsWith("q"))
				intList.set(16, intList.get(16) + 1);
			else if(j.startsWith("R") || j.startsWith("r"))
				intList.set(17, intList.get(17) + 1);
			else if(j.startsWith("S") || j.startsWith("s"))
				intList.set(18, intList.get(18) + 1);
			else if(j.startsWith("T") || j.startsWith("t"))
				intList.set(19, intList.get(19) + 1);
			else if(j.startsWith("U") || j.startsWith("u"))
				intList.set(20, intList.get(20) + 1);
			else if(j.startsWith("V") || j.startsWith("v"))
				intList.set(21, intList.get(21) + 1);
			else if(j.startsWith("W") || j.startsWith("w"))
				intList.set(22, intList.get(22) + 1);
			else if(j.startsWith("X") || j.startsWith("x"))
				intList.set(23, intList.get(23) + 1);
			else if(j.startsWith("Y") || j.startsWith("y"))
				intList.set(24, intList.get(24) + 1);
			else
				intList.set(25, intList.get(25) + 1);
		}
		
		return intList;
	}
	
	public static ArrayList<String> beginAndEndSameLetter(ArrayList<String> list) {
		ArrayList<String> ret = new ArrayList<String>();
		for(String i : list) {
			if(i.toLowerCase().endsWith(i.toLowerCase().substring(0, 1))) {
				ret.add(i);
			}
		}
		
		return ret;
	}
	
	
	
	
}
