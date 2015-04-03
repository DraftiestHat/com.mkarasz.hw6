package com.mkarasz.hw6.KML;

public class MainKML {

	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		WriteKML.writeKML(rf.getLocationList());
		System.out.println("location.kml written.");
	}

}
