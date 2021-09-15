package com.bridgelabz.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bridgelabz.cabinvoicegenerator.InvoiceSummery;
import java.util.Scanner;

public class CabInvoiceGenerator {
	double minimumCost = 10;
	int costPerTime = 1;
	int minimumFare = 5;
	HashMap<Integer, InvoiceSummery> hashmap = new HashMap<Integer, InvoiceSummery>();
	CabInvoiceGenerator cabInvoiceGenerator;

	public double calculatefare(double distance, int time) {

		double totalfare = distance * minimumCost + time * minimumCost;

		if (totalfare < minimumFare)
		return totalfare;
		return minimumFare;
	}

	public InvoiceSummery calculatefare(Ride[] rides) {
		double totalfare = 0;
		for (Ride ride : rides) {
			totalfare += this.calculatefare(ride.distance, ride.time);
		}

		return new InvoiceSummery(rides.length, totalfare);

	}

	public InvoiceSummery listOfRides(Ride[] rides, int num) {
		double totalfare = 0;
		for (Ride ride : rides) {
			totalfare += this.calculatefare(ride.distance, ride.time);
		}

		hashmap.put(num, new InvoiceSummery(rides.length, totalfare));
		
		return new InvoiceSummery(rides.length, totalfare);
	}

	public String invoicePerId(int i) {
		return String.valueOf(hashmap.get(i));
	}
}
