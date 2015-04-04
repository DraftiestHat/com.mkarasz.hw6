package com.mkarasz.hw6.Elements;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadElements {
	protected static ArrayList<Element> text(String fileName) {
		//System.out.println("Reading File from Java code.");
		ArrayList<Element> elemList = new ArrayList<Element>();
	    String[] tokens = null;
	    Element elem = null;
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
	       
	       while((line = bufferReader.readLine()) != null) {
	    	   line = line.trim().replaceAll(" +", " ");
	    	   tokens = line.split(" ");
	    	   if(tokens.length == 10) {
	    		   elem = new Element(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Double.parseDouble(tokens[5]), Double.parseDouble(tokens[6]), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]), Double.parseDouble(tokens[9]));
	    	   		elemList.add(elem);
	    	   }
	       }
	       
	       //Close the buffer reader
	       bufferReader.close();
	       
	    }catch(Exception e){
	       System.out.println("Error while reading file line by line:" + e.getMessage());
	       System.out.println(tokens.length + "");
	       for(String i : tokens) {
	    	   System.out.println(i + "\n");
	       }
	       e.printStackTrace();
	       System.exit(-1);
	    }
	    
	    return elemList;
	}
	
	@SuppressWarnings("unchecked")
	protected static ArrayList<Element> serialized(String fileName){
		ObjectInputStream ois = null;
		ArrayList<Element> list = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			list = (ArrayList<Element>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(fileName + " read.");
		return list;
	}
}
