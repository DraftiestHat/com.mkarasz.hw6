package com.mkarasz.hw6.KML;

/**Easy implementation
 * @author Matt
 *
 */
public class MainKML {

	/** Wrapper for testing read and write location files
	 * @param args
	 */
	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		WriteKML.writeKML(rf.getLocationList());
		System.out.println("location.kml written.");
	}

}
