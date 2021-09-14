package com.bridgelabz.cabinvoicegeneratortest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;

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
	}
	
	@Test
	public void givenDistanceAndTime_invoiceGenerator_shouldReturnminimumFare() {
		CabInvoiceGenerator cabInvoiceGenerator=new CabInvoiceGenerator();
		double distance=0.3;
		int time=5;
		double result=cabInvoiceGenerator.calculatefare(distance, time);
		Assert.assertEquals(5, result,0.0);
	}
}
