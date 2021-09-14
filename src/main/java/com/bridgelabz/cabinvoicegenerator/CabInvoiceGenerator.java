package com.bridgelabz.cabinvoicegenerator;

import com.bridgelabz.cabinvoicegenerator.InvoiceSummery;

public class CabInvoiceGenerator {
	double minimumCost = 10;
	int costPerTime = 1;
	int minimumFare = 5;

	public double calculatefare(double distance, int time) {

		double totalfare = distance * minimumCost + time * minimumCost;
		
			return Math.max(totalfare, minimumFare);
		

	}

	public InvoiceSummery calculatefare(Ride[] rides) {
		double totalfare = 0;
		for (Ride ride : rides) {
			totalfare += this.calculatefare(ride.distance, ride.time);
		}

		return new InvoiceSummery(rides.length,totalfare);

	}
}
