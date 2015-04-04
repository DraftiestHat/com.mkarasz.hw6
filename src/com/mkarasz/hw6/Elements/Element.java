package com.mkarasz.hw6.Elements;

import java.util.Comparator;

public class Element implements Comparable<Element>{
	private String name;
	private String symbol;
	private int orderNumber;
	private int R;
	private int C;
	private double atomicWeight;
	private double density;
	private double atomicDiameter;
	private double terrestrialAbundance;
	private double coefctOfResistance;
	
	public Element() {
		this(null, null, 0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.0);
	}
	
	public Element(String name, String symbol, int orderNumber, int R, int C, double atomicWeight, double density, double atomicDiameter, double terrestrialAbundance, double coefctOfResistance) {
		this.name = name;
		this.symbol = symbol;
		this.orderNumber = orderNumber;
		this.R = R;
		this.C = C;
		this.atomicWeight = atomicWeight;
		this.density = density;
		this.atomicDiameter = atomicDiameter;
		this.terrestrialAbundance = terrestrialAbundance;
		this.coefctOfResistance = coefctOfResistance;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the r
	 */
	public int getR() {
		return R;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		R = r;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return C;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		C = c;
	}
	/**
	 * @return the atomicWeight
	 */
	public double getAtomicWeight() {
		return atomicWeight;
	}
	/**
	 * @param atomicWeight the atomicWeight to set
	 */
	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}
	/**
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	/**
	 * @return the atomicDiameter
	 */
	public double getAtomicDiameter() {
		return atomicDiameter;
	}
	/**
	 * @param atomicDiameter the atomicDiameter to set
	 */
	public void setAtomicDiameter(double atomicDiameter) {
		this.atomicDiameter = atomicDiameter;
	}
	/**
	 * @return the terrestrialAbundance
	 */
	public double getTerrestrialAbundance() {
		return terrestrialAbundance;
	}
	/**
	 * @param terrestrialAbundance the terrestrialAbundance to set
	 */
	public void setTerrestrialAbundance(double terrestrialAbundance) {
		this.terrestrialAbundance = terrestrialAbundance;
	}
	/**
	 * @return the coefctOfResistance
	 */
	public double getCoefctOfResistance() {
		return coefctOfResistance;
	}
	/**
	 * @param coefctOfResistance the coefctOfResistance to set
	 */
	public void setCoefctOfResistance(double coefctOfResistance) {
		this.coefctOfResistance = coefctOfResistance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Element elem) {
		String nameOtherElem = elem.getName();
		return elem.getName().compareToIgnoreCase(nameOtherElem);
	}
	
	public static Comparator<Element> ElementTerrestrialAbundanceComparator = new Comparator<Element>() {
		public int compare(Element elem1, Element elem2) {
			double i =  elem1.getTerrestrialAbundance();
			double j = elem2.getTerrestrialAbundance();
			
			if (i < j) return -1;
			if (i > j) return 1;
			return 0;
		}
	};
	
	
	
	
	
	
	
}
