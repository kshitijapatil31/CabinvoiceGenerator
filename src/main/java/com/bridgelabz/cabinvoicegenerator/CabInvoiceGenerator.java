package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;

import com.bridgelabz.cabinvoicegenerator.InvoiceSummery;

public class CabInvoiceGenerator {

	public enum RideType {
		REGULAR, PREMIUM;
	}

	double minimumCost = 10;
	int costPerTime = 1;
	int minimumFare = 5;
	HashMap<Integer, InvoiceSummery> hashmap = new HashMap<Integer, InvoiceSummery>();
	CabInvoiceGenerator cabInvoiceGenerator;

	public double calculatefare(double distance, int time) {

		double totalfare = distance * minimumCost + time * costPerTime;

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

	public double calculateRidefare(double distance, int time, Enum RadeType) {
		double totalfare=0;
		
		if (RadeType == RideType.REGULAR) {
			 totalfare = distance * RideInfo.normalCostPerKm + time * RideInfo.normalcostPerMin;

			if (totalfare < RideInfo.normalminimumfare) {

				return RideInfo.normalminimumfare;
			}
			return totalfare;
		} else if (RadeType == RideType.PREMIUM) {
			 totalfare = distance * RideInfo.premiumCostPerKm + time * RideInfo.premiumcostPerMin;

			if (totalfare < RideInfo.premiumminimumfare) {

				return RideInfo.premiumminimumfare;
			}
			return totalfare;
		}
		
		return totalfare;
		
	}
	

	public String invoicePerId(int i) {
		return String.valueOf(hashmap.get(i));
	}

	public InvoiceSummery calculatefare(Ride[] rides, RideType rideType) {
		double totalfare = 0;
		int num=1;
		for (Ride ride : rides) {
			totalfare += this.calculateRidefare(ride.distance, ride.time,rideType);
		}

		hashmap.put(num, new InvoiceSummery(rides.length, totalfare));

		return new InvoiceSummery(rides.length, totalfare);
	}
		
	}

