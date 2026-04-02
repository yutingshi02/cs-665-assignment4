/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: CustomerDataViaHttps.java
 * Description: new system interface (modern HTTPS/REST API)
 */

package edu.bu.met.cs665.assignment4;

public interface CustomerDataViaHttps {

	void printCustomer(int customerId);
	Customer getCustomerViaHttps(int customerId);
}