package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
	double minimumCost=10;
	int costPerTime=1;
int minimumFare=5;
	public double calculatefare(double distance, int time) {
		
	double totalfare= distance *minimumCost+time*minimumCost;
	if(totalfare>minimumFare) {
		return totalfare;
	}else {
		return 0.0;
	}
	}
	public double calculatefare(Ride[] rides) {
		double totalfare=0;
		for(Ride ride:rides) {
			totalfare+=this.calculatefare(ride.distance,ride.time);
		}
		
		return totalfare;
		
		
	}
}
