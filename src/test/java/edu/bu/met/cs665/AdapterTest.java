/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: AdapterTest.java
 * Description: testing for this assignment
 */

package edu.bu.met.cs665.assignment4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AdapterTest {

	private CustomerDataViaUsb legacy;
	private CustomerDataViaUsb adapter;

	@Before
	public void setUp() {
		legacy = new Usb();
		adapter = new UsbToHttpsAdapter(new Https());
	}

	@Test
	public void testLegacySystem() {
		Customer c = legacy.getCustomerViaUsb(1);
		assertEquals("USB_User_1", c.getName());
	}

	@Test
	public void testAdapterUsesHttps() {
		Customer c = adapter.getCustomerViaUsb(2);
		assertEquals("HTTPS_User_2", c.getName());
	}

	@Test
	public void testAdapterPrint() {
		adapter.printCustomer(3);
		assertTrue(true); 
	}

	@Test
	public void testDifferentSystemsReturnDifferentResults() {

		Customer usbCustomer = legacy.getCustomerViaUsb(4);
        
		Customer httpsCustomer = adapter.getCustomerViaUsb(4);

		assertTrue(!usbCustomer.getName().equals(httpsCustomer.getName()));
	}
}