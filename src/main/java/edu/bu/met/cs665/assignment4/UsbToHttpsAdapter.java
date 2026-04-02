/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: UsbToHttpsAdapter.java
 * Description: adapter class that allows the new HTTPS system to be used through the old USB interface
 */

package edu.bu.met.cs665.assignment4;

public class UsbToHttpsAdapter implements CustomerDataViaUsb {

	private CustomerDataViaHttps httpsCustomer;

	public UsbToHttpsAdapter(CustomerDataViaHttps httpsCustomer) {
		this.httpsCustomer = httpsCustomer;
	}

	@Override
	public void printCustomer(int customerId) {
		httpsCustomer.printCustomer(customerId);
	}

	@Override
	public Customer getCustomerViaUsb(int customerId) {
		return httpsCustomer.getCustomerViaHttps(customerId);
	}
}