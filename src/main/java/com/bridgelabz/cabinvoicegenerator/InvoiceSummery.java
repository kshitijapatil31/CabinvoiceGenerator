package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummery {

	private int numOfrides;
	private double totalFare;
	private double average;

	public InvoiceSummery(int numOfrides, double totalFare) {
	this.numOfrides=numOfrides;
	this.totalFare=totalFare;
	this.average=this.totalFare/this.numOfrides;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummery other = (InvoiceSummery) obj;
		if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
			return false;
		if (numOfrides != other.numOfrides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "InvoiceSummery [numOfrides=" + numOfrides + ", totalFare=" + totalFare + ", average=" + average + "]";
	}

	
}
