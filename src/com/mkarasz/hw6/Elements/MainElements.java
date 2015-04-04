package com.mkarasz.hw6.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MainElements {

	public static void main(String[] args) {
		System.out.println("This currently doesn't take in a file name. Should have specified that in the requirements if you wanted it.");
		ArrayList<Element> list = readFileByLineAndDeliminate("periodic.txt");
		SortElements.name(list);
		PrintElements.text(list, "elements.txt");
		SortElements.terrestrial(list);
		PrintElements.serialized(list, "abundance.bin");
		list = readSerialized("abundance.bin");
		PrintElements.text(list, "abundance.txt");
	}
	
	private static ArrayList<Element> readFileByLineAndDeliminate(String fileName) {
		//System.out.println("Reading File from Java code.");
		ArrayList<Element> elemList = new ArrayList<Element>();
	    
	    try{
	
	       //Create object of FileReader
	       FileReader inputFile = new FileReader(fileName);
	
	       //Instantiate the BufferedReader Class
	       BufferedReader bufferReader = new BufferedReader(inputFile);
	
	       //Variable to hold the one line data
	       String line = bufferReader.readLine();
	       
	       if(line.equals(null)) {
	    	   System.out.println("No information in file.");
	    	   System.exit(-1);
	       }

	       
	       for(int i = 0; i < 20; i++) {
	    	   line = bufferReader.readLine();
	       }
	       
	       //READ INFO INTO ELEMENT ARRAYLIST.
	       
	       //Close the buffer reader
	       bufferReader.close();
	       
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line:" + e.getMessage());                      
	    }
	    
	    return elemList;
	}
	
	private static ArrayList<Element> readSerialized(String fileName){
		
		return null;
	}

}
