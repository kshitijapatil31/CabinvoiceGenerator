package com.bridgelabz.cabinvoicegenerator;

public class RideInfo {

	static double normalCostPerKm;
	static double normalcostPerMin;
	static int normalminimumfare;
	
	static double premiumCostPerKm;
	static double premiumcostPerMin;
	static int premiumminimumfare;
	public RideInfo(double normalCostPerKm, double normalcostPerMin, int normalminimumfare, double premiumCostPerKm,
			double premiumcostPerMin, int premiumminimumfare) {
		super();
		this.normalCostPerKm = normalCostPerKm;
		this.normalcostPerMin = normalcostPerMin;
		this.normalminimumfare = normalminimumfare;
		this.premiumCostPerKm = premiumCostPerKm;
		this.premiumcostPerMin = premiumcostPerMin;
		this.premiumminimumfare = premiumminimumfare;
	}
	
	
	
}
