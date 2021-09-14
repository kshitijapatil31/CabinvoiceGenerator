package com.bridgelabz.cabinvoicegeneratortest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import com.bridgelabz.cabinvoicegenerator.InvoiceSummery;
import com.bridgelabz.cabinvoicegenerator.Ride;

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
	
		InvoiceSummery expectedInvoicesummery=new InvoiceSummery(2,30.0);
		
		Assert.assertEquals(expectedInvoicesummery, summery);
	}
}