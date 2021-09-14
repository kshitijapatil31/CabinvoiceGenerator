package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
	double minimumCost=10;
	int costPerTime=1;

	public double calculatefare(double distance, int time) {
		
		return distance *minimumCost+time*minimumCost;
	}
}
