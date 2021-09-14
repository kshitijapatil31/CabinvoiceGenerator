package com.bridgelabz.cabinvoicegeneratortest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import com.bridgelabz.cabinvoicegenerator.Ride;

import org.junit.Assert;


public class CabInvoiceGeneratorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(53, result,0.0);
<<<<<<< HEAD
	}
	
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnminimumFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(5, result,0.0);
=======
>>>>>>> uc2
	}
	
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnminimumFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(5, result,0.0);
	}
	@Test
	public void givenMultipleRides_invoiceGenerator_shouldReturnAggregateTotalForAll() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		Ride[] rides= {
				new Ride(2.0,5),
				new Ride(0.1,1)
				};
		double fare=cabInvoiceGenerator.calculatefare(rides);
		Assert.assertEquals(81, fare,0.0);
	}
}