package com.mkarasz.hw6.simpleText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	private ArrayList<String> wordList;
	
	/**
	 * Just a wrapper to get the file the first time an object is made
	 */
	public ReadFile() {
		String fileName = getFilename();		
		readFileByWord(fileName);
	}
	
	/** Wrapper, same as regular constructor just with taking in a file
	 * @param fileName
	 */
	public ReadFile(String fileName) {
		readFileByWord(fileName);
	}
	
	/** For getting user input for a file name
	 * @return the filename
	 */
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
	
	/** Reads the file in and stores word by word
	 * @param fileName the file to read in
	 */
	private void readFileByWord(String fileName) {
		//System.out.println("Reading File from Java code.");
		this.wordList = new ArrayList<String>();
	    
	    try{
	
	       //Create object of FileReader
	       FileReader inputFile = new FileReader(fileName);
	
	       //Instantiate the BufferedReader Class
	       BufferedReader bufferReader = new BufferedReader(inputFile);
	
	       //Variable to hold the one line data
	       String line;
	
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

	
	
	/** Gives back an arraylist of words gotten from the file
	 * @return the wordList arraylist of words from file.
	 */
	public ArrayList<String> getWordList() {
		return wordList;
	}

	/** takes a file to read the words from 
	 * @param fileName the file to read the words from
	 */
	public void setWordList(String fileName) { 
		readFileByWord(fileName);
	}
	
		
	
	
}
