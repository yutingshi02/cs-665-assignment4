/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: Https.java
 * Description: implementation of the new HTTPS system 
 */

package edu.bu.met.cs665.assignment4;

public class Https implements CustomerDataViaHttps {

	@Override
	public void printCustomer(int customerId) {
		Customer c = getCustomerViaHttps(customerId);
		System.out.println("HTTPS " + c);
	}

	@Override
	public Customer getCustomerViaHttps(int customerId) {
		return new Customer(customerId, "HTTPS_User_" + customerId);
	}
}