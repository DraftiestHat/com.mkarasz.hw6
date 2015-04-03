package com.mkarasz.hw6.KML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteKML {
	
	
	public static void writeKML(ArrayList<String[]> list) {
		int j = 1;
		BufferedWriter buf = null;
		
		try {
			buf = new BufferedWriter(new FileWriter(new File("location.kml")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printHeader(buf);
		
		for(String[] i : list) {
			printLocation(buf, i, "Location " + j);
			j++;
		}
		
		printFooter(buf);
		try {
			buf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printHeader(BufferedWriter buf) {
		try {
			buf.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			buf.write("<kml xmlns=\"http://earth.google.com/kml/2.1\">\n");
			buf.write("<Document>\n");
			buf.write("\t<name>Mystery Locations></name>\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void printFooter(BufferedWriter buf) {
		try {
			buf.write("</Document>\n</kml>\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printLocation(BufferedWriter buf, String[] i, String locationName) {
		try {
			buf.write("\t<Placemark>\n");
			buf.write("\t\t<name> " + locationName + "</name>\n");
			buf.write("\t\t<Point>\n");
			buf.write("\t\t\t<coordinates>" + i[0] + "," + i[1] + ",0</coordinates>\n");
			buf.write("\t\t</Point>\n");
			buf.write("\t</Placemark>\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
