package com.mkarasz.hw6.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Prints elementLists in a variety of ways
 * @author Matt
 *
 */
public class PrintElements {
	/**
	 * Reads element lists to human readable text
	 * @param list the list to print
	 * @param fileName the file to write to
	 */
	protected static void text(ArrayList<Element> list, String fileName) {
		BufferedWriter buf = null;
		
		try {
			buf = new BufferedWriter(new FileWriter(new File(fileName)));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.exit(-1);
		}
		
		try {
			buf.write("Element\t\t\tSymbol\tOrder#\tR\tC\tAtomic Weight\tDensity\t\tAtomic Diameter\tTerr.Abund.\tCoef.of Resis.\n");
			//prints a delimintator
			for(int j = 0; j < 110; j++){
				buf.write("-");
			}
			buf.write("\n");
			//UGLY writing out info properly deliminated. Could have done this with algorithms - meh.
			for(Element i : list) {
				buf.write(i.getName() + "");
				for(int j = i.getName().length(); j < 16 ; j++) {
					buf.write(" ");
				}
				buf.write(i.getSymbol() + "");
				for(int j = i.getSymbol().length(); j < 8; j++) {
					buf.write(" ");
				}
				buf.write(i.getOrderNumber() + "");
				for(int j = Integer.toString(i.getOrderNumber()).length(); j < 8; j++) {
					buf.write(" ");
				}
				buf.write(i.getR() + "");
				for(int j = Integer.toString(i.getR()).length(); j < 4; j++) {
					buf.write(" ");
				}
				buf.write(i.getC() + "");
				for(int j = Integer.toString(i.getC()).length(); j < 4; j++) {
					buf.write(" ");
				}
				buf.write(i.getAtomicWeight() + "");
				for(int j = Double.toString(i.getAtomicWeight()).length(); j < 16; j++) {
					buf.write(" ");
				}
				buf.write(i.getDensity() + "");
				for(int j = Double.toString(i.getDensity()).length(); j < 12; j++) {
					buf.write(" ");
				}
				buf.write(i.getAtomicDiameter() + "");
				for(int j = Double.toString(i.getAtomicDiameter()).length(); j < 16; j++) {
					buf.write(" ");
				}
				buf.write(i.getTerrestrialAbundance() + "");
				for(int j = Double.toString(i.getTerrestrialAbundance()).length(); j < 12; j++) {
					buf.write(" ");
				}
				buf.write(i.getCoefctOfResistance() + "\n");
		}
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		try {
			buf.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(fileName + " printed.");
	}
	
	
	/** Prints elements in serialized form
	 * @param list the list to print
	 * @param fileName the file to write to
	 */
	protected static void serialized(ArrayList<Element> list, String fileName){
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(list);
			out.close();
			System.out.println(fileName + " had serialized data written to it.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
