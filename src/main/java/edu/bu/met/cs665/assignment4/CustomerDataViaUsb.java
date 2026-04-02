/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: CustomerDataViaUsb.java
 * Description: legacy interface (old system API using USB)
 */

package edu.bu.met.cs665.assignment4;

public interface CustomerDataViaUsb {

	void printCustomer(int customerId);
	Customer getCustomerViaUsb(int customerId);
}