package com.mkarasz.hw6.Elements;

import java.util.ArrayList;

public class MainElements {

	/** Caller for elements using specific file names.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This currently doesn't take in a file name.");
		ArrayList<Element> list = ReadElements.text("periodic.txt");
		SortElements.name(list);
		PrintElements.text(list, "elements.txt");
		SortElements.terrestrial(list);
		PrintElements.serialized(list, "abundance.bin");
		list = ReadElements.serialized("abundance.bin");
		PrintElements.text(list, "abundance.txt");
	}
}
