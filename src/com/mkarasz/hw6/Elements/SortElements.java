package com.mkarasz.hw6.Elements;

import java.util.ArrayList;
import java.util.Collections;

/** Just a wrapper for sorting
 * @author Matt
 *
 */
public class SortElements {
	/**
	 * Wrapper for calling the sort name easier
	 * @param list the list to sort
	 */
	protected static void name(ArrayList<Element> list) {
		Collections.sort(list);
	}
	
	/**
	 * Just a wrapper for calling sort terrestrial easier
	 * @param list the list to sort
	 */
	protected static void terrestrial(ArrayList<Element> list) {
		Collections.sort(list, Element.ElementTerrestrialAbundanceComparator);
	}
}
