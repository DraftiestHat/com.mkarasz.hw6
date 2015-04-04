package com.mkarasz.hw6.Elements;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
	protected static void name(ArrayList<Element> list) {
		Collections.sort(list);
	}
	
	protected static void terrestrial(ArrayList<Element> list) {
		Collections.sort(list, Element.ElementTerrestrialAbundanceComparator);
	}
}
