package com.mkarasz.hw6.simpleText;

import java.util.ArrayList;
import java.util.Collections;

public final class Word {
	public static int shortestWordLength(ArrayList<String> list) {
		int shortLength = -1;
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
		
		freqList.add((double) Collections.frequency(list, "a"));
		freqList.add((double) Collections.frequency(list, "b"));
		freqList.add((double) Collections.frequency(list, "c"));
		freqList.add((double) Collections.frequency(list, "d"));
		freqList.add((double) Collections.frequency(list, "e"));
		freqList.add((double) Collections.frequency(list, "f"));
		freqList.add((double) Collections.frequency(list, "g"));
		freqList.add((double) Collections.frequency(list, "h"));
		freqList.add((double) Collections.frequency(list, "i"));
		freqList.add((double) Collections.frequency(list, "j"));
		freqList.add((double) Collections.frequency(list, "k"));
		freqList.add((double) Collections.frequency(list, "l"));
		freqList.add((double) Collections.frequency(list, "m"));
		freqList.add((double) Collections.frequency(list, "n"));
		freqList.add((double) Collections.frequency(list, "o"));
		freqList.add((double) Collections.frequency(list, "p"));
		freqList.add((double) Collections.frequency(list, "q"));
		freqList.add((double) Collections.frequency(list, "r"));
		freqList.add((double) Collections.frequency(list, "s"));
		freqList.add((double) Collections.frequency(list, "t"));
		freqList.add((double) Collections.frequency(list, "u"));
		freqList.add((double) Collections.frequency(list, "v"));
		freqList.add((double) Collections.frequency(list, "w"));
		freqList.add((double) Collections.frequency(list, "x"));
		freqList.add((double) Collections.frequency(list, "y"));
		freqList.add((double) Collections.frequency(list, "z"));
		
		
		
		
		
		
		return null;
	}
	
	private static void splitCharacters(String i, ArrayList<String> list) {
		int len = i.length();
		String tmp = null;
		
		for(int j = 0; j < len; j++) {
			System.out.println("j is " + j + " and the letter is " + i.substring(j, j+1));
			tmp = i.substring(j, j + 1);
			tmp.toLowerCase();
			list.add(tmp);
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
}
