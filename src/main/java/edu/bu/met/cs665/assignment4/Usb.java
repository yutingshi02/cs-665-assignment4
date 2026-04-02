/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: Usb.java
 * Description: implementation of the legacy USB system
 */

package edu.bu.met.cs665.assignment4;

public class Usb implements CustomerDataViaUsb {

	@Override
	public void printCustomer(int customerId) {
		Customer c = getCustomerViaUsb(customerId);
		System.out.println("USB " + c);
	}

	@Override
	public Customer getCustomerViaUsb(int customerId) {
		return new Customer(customerId, "USB_User_" + customerId);
	}
}