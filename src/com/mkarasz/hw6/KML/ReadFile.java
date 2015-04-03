package com.mkarasz.hw6.KML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	private ArrayList<String[]> locationList;
	
	/**
	 * @return the locationList
	 */
	public ArrayList<String[]> getLocationList() {
		return locationList;
	}

	/**
	 * @param locationList the locationList to set
	 */
	public void setLocationList(ArrayList<String[]> locationList) {
		String fileName = getFilename();
		readFileByLineAndDeliminate(fileName);
	}

	public ReadFile() {
		String fileName = getFilename();		
		readFileByLineAndDeliminate(fileName);
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
	
	private void readFileByLineAndDeliminate(String fileName) {
		//System.out.println("Reading File from Java code.");
		this.locationList = new ArrayList<String[]>();
	    
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

	       String[] tokens = line.split("\\|");
	       if(tokens[0].replaceAll("\\s+","").equals("LAT") == false) {
	    	   System.out.println(tokens[0] + "");
	    	   System.out.println(tokens[1] + "");
	    	   System.out.println("Check the friggin spaces-LAT.");
	    	   System.exit(-1);
	       }
	       
	       if(tokens[1].replaceAll("\\s+","").equals("LONG") == false) {
	    	   System.out.println("Check the friggin spaces - LONG");
	    	   System.exit(-1);
	       }
	
	       while ((line = bufferReader.readLine()) != null)   {
	         tokens = line.split("\\|");
	         tokens[0] = tokens[0].replaceAll("\\s+","");
	         tokens[1] = tokens[1].replaceAll("\\s+","");
	         this.locationList.add(tokens);
	       }
	       //Close the buffer reader
	       bufferReader.close();
	       
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line:" + e.getMessage());                      
	    }
	}

}
