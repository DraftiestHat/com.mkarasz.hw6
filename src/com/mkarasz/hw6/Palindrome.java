package com.mkarasz.hw6;

import java.util.ArrayList;
import java.util.Collections;

public final class Palindrome {
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
}
