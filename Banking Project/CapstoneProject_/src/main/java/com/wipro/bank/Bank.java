package com.wipro.bank;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.model.Customer;

public class Bank {
 @Autowired
 private Customer customer;

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
