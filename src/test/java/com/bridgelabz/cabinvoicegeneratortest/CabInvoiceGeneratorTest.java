package com.bridgelabz.cabinvoicegeneratortest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator.RideType;
import com.bridgelabz.cabinvoicegenerator.InvoiceSummery;
import com.bridgelabz.cabinvoicegenerator.Ride;
import com.bridgelabz.cabinvoicegenerator.RideInfo;

import org.junit.Assert;
import org.junit.Before;


public class CabInvoiceGeneratorTest {
	CabInvoiceGenerator cabInvoiceGenerator=null;
	@Before
	public void setUp()throws Exception{
		 cabInvoiceGenerator=new CabInvoiceGenerator();
	}
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnTotalFare() {
		
		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(53, result,0.0);

	}
	
	
	
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnminimumFare() {

		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(5, result,0.0);
	}
	@Test
	public void givenMultipleRides_invoiceGenerator_shouldReturnInvoiceSummery() {
		Ride[] rides= {
				new Ride(2.0,5),
				new Ride(0.1,1)
				};
		InvoiceSummery summery=cabInvoiceGenerator.calculatefare(rides);
	
		InvoiceSummery expectedInvoicesummery=new InvoiceSummery(2,10.0);
		
		Assert.assertEquals(expectedInvoicesummery, summery);
	}
	@Test
	
	public void givenUserId_InvoiceGenerator_shouldReturnRides() {
		
		Ride[] rides1= {
				new Ride(2.0,5),
				new Ride(0.1,1),
				new Ride(3.0,6)
				};
		Ride[] rides2= {
				new Ride(4.0,5),
				new Ride(2.0,1),
				new Ride(5.0,6)
				};
		cabInvoiceGenerator.listOfRides(rides1,1);
	
		Assert.assertEquals("InvoiceSummary[noOfRides=3, totalFare=15.0, average=5.0]",cabInvoiceGenerator.invoicePerId(1));
		cabInvoiceGenerator.listOfRides(rides2,2);
		
		Assert.assertEquals("InvoiceSummary[noOfRides=3, totalFare=40.0, average=185.0]",cabInvoiceGenerator.invoicePerId(2));
	}
	
	@Test
	public void givenTwoCategories_InvoiceGenerator_shouldReturnSummery() {
		Ride[] rides1= {
				new Ride(2.0,5),
				new Ride(0.1,1),
				new Ride(3.0,6)
				};
		Ride[] rides2= {
				new Ride(4.0,5),
				new Ride(2.0,1),
				new Ride(5.0,6)
				};
		RideInfo info=new RideInfo(10,1,5,15,2,20);
		cabInvoiceGenerator.calculatefare(rides1,RideType.REGULAR);
		cabInvoiceGenerator.calculatefare(rides2,RideType.PREMIUM);
		Assert.assertEquals("InvoiceSummary[noOfRides=3, totalFare=12.0, average=4.0]",cabInvoiceGenerator.invoicePerId(1));
		Assert.assertEquals("InvoiceSummary[noOfRides=2, totalFare=89.0, average=23.0]",cabInvoiceGenerator.invoicePerId(1));

	}
}



