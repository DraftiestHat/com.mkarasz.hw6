package com.mkarasz.hw6.Elements;

import java.io.Serializable;
import java.util.Comparator;

public class Element implements Comparable<Element>, Serializable{
	/**
	 * I have no clue, but this was generated.
	 */
	private static final long serialVersionUID = 4765490011903526827L;
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
	
	/**
	 * Basic null constructor
	 */
	public Element() {
		this(null, null, 0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0.0);
	}
	
	/**
	 * Actual element constructor
	 * @param name name of the element
	 * @param symbol one to three letter symbol of the element
	 * @param orderNumber the order number of the element
	 * @param R the R of the element
	 * @param C the C of the element
	 * @param atomicWeight the atomic weight of the element
	 * @param density the density of the element
	 * @param atomicDiameter the diameter of the element
	 * @param terrestrialAbundance how much of the element is on this earth, relatively
	 * @param coefctOfResistance how much electrical resistance the element has.
	 */
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
	 * Get the name of the element
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set the name of the element (why you would want to, IDK)
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get the symbol of the element
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * Set the symbol of the element (why you would want to, IDK)
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * Get the order number of the element
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * Set the order number of the element (why you would want to, IDK)
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * Get the R of the element
	 * @return the r
	 */
	public int getR() {
		return R;
	}
	
	/**
	 * Set the R of the element (why you would want to, IDK)
	 * @param r the r to set
	 */
	public void setR(int r) {
		R = r;
	}
	/**
	 * Get the C of the element
	 * @return the c
	 */
	public int getC() {
		return C;
	}
	/**
	 * Set the C of the element (why you would want to, IDK)
	 * @param c the c to set
	 */
	public void setC(int c) {
		C = c;
	}
	/**
	 * Get the atomic weight of the element
	 * @return the atomicWeight
	 */
	public double getAtomicWeight() {
		return atomicWeight;
	}
	/**
	 * Set the atomic weight of the element (why you would want to, IDK)
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
	 * Set the density of the element (why you would want to, IDK)
	 * @param density the density to set
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	/**
	 * Get the name of the element
	 * @return the atomicDiameter
	 */
	public double getAtomicDiameter() {
		return atomicDiameter;
	}
	/**
	 * Set the atomic diameter of the element (why you would want to, IDK)
	 * @param atomicDiameter the atomicDiameter to set
	 */
	public void setAtomicDiameter(double atomicDiameter) {
		this.atomicDiameter = atomicDiameter;
	}
	/**
	 * Get the name of the element
	 * @return the terrestrialAbundance
	 */
	public double getTerrestrialAbundance() {
		return terrestrialAbundance;
	}
	/**
	 * Set the terrestrial abundance of the element (why you would want to, IDK)
	 * @param terrestrialAbundance the terrestrialAbundance to set
	 */
	public void setTerrestrialAbundance(double terrestrialAbundance) {
		this.terrestrialAbundance = terrestrialAbundance;
	}
	/**
	 * Get the coefficient of resistance of the element
	 * @return the coefctOfResistance
	 */
	public double getCoefctOfResistance() {
		return coefctOfResistance;
	}
	/**
	 * Set the coefficient of resistance of the element (why you would want to, IDK)
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
		return this.getName().compareToIgnoreCase(nameOtherElem);
	}
	
	/**
	 * Subclass to compare terrestrial abundance
	 */
	public static Comparator<Element> ElementTerrestrialAbundanceComparator = new Comparator<Element>() {
		/* (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		public int compare(Element elem1, Element elem2) {
			double i =  elem1.getTerrestrialAbundance();
			double j = elem2.getTerrestrialAbundance();
			
			if (i < j) return -1;
			if (i > j) return 1;
			return 0;
		}
	};
	
	
	
	
	
	
	
}
