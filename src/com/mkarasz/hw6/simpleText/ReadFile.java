package com.mkarasz.hw6.simpleText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	private ArrayList<String> wordList;
	
	public ReadFile() {
		String fileName = getFilename();		
		readFileByWord(fileName);
	}
	
	private String getFilename() {
		String fileName = null;
		System.out.println("Please insert a filename.");
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextLine()) {
			fileName = in.nextLine();
		}
		
		in.close();
		return fileName;
	}
	
	private void readFileByWord(String fileName) {
		System.out.println("Reading File from Java code.");
		this.wordList = new ArrayList<String>();
	    
	    try{
	
	       //Create object of FileReader
	       FileReader inputFile = new FileReader(fileName);
	
	       //Instantiate the BufferedReader Class
	       BufferedReader bufferReader = new BufferedReader(inputFile);
	
	       //Variable to hold the one line data
	       String line;
	
	       // Read file line by line and print on the console
	       while ((line = bufferReader.readLine()) != null)   {
	         String[] tokens = line.split(" ");
	         for(String i : tokens) {
	        	 this.wordList.add(i);
	         }
	       }
	       //Close the buffer reader
	       bufferReader.close();
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line:" + e.getMessage());                      
	    }
	}

	
	
	/**
	 * @return the wordList
	 */
	public ArrayList<String> getWordList() {
		return wordList;
	}

	/**
	 * @param fileName
	 */
	public void setWordList(String fileName) { 
		readFileByWord(fileName);
	}
	
		
	
	
}
