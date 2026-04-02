/*
 * Name: Yuting Shi 
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/01/2026
 * File Name: Customer.java
 * Description: model class representing a customer 
*/

package edu.bu.met.cs665.assignment4;

public class Customer {

	private int id;
	private String name;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer{id=" + id + ", name='" + name + "'}";
	}
}