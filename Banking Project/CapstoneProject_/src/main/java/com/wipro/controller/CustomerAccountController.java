package com.wipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bank.Bank;
import com.wipro.exception.ResourceNotFoundException;
import com.wipro.model.Customer;
import com.wipro.model.Transaction;
import com.wipro.service.CustomerService;

@RestController
public class CustomerAccountController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/bank")
	public ResponseEntity<Customer> Customer(@RequestBody Bank bank){
		return new ResponseEntity<Customer>(customerService.save(bank.getCustomer()),HttpStatus.CREATED);
		
	}
	@GetMapping("/getCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() throws ResourceNotFoundException{
		List<Customer> list=customerService.getAllCustomers();
		if(list.size()==0) 
			throw new ResourceNotFoundException("There is no customer records");
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(),HttpStatus.FOUND);
	}
  @GetMapping("/getCustomer/{customerid}")
  public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int customerid) throws ResourceNotFoundException
  {
	  Optional<Customer> customer=customerService.getCustomerById(customerid);
	  if(customer.isEmpty())
		  throw new ResourceNotFoundException("No customer id is present in db,please change your request");
	  return new ResponseEntity<Optional<Customer>>(customerService.getCustomerById(customerid),HttpStatus.FOUND);
  }
  @PutMapping("/updateCustomer")
  public ResponseEntity<Customer>updateCustomer(@RequestBody Bank bank){
	  return new ResponseEntity<Customer>(customerService.save(bank.getCustomer()),HttpStatus.CREATED);
  }
  @DeleteMapping("/deleteCustomer/{customerid}")
  public ResponseEntity<String> deleteCustomer(@PathVariable int customerid){
	  customerService.deleteById(customerid);
	  return new ResponseEntity<String>("Deleted",HttpStatus.OK);
  }
  @DeleteMapping("/deleteAllCustomers")
  public ResponseEntity<String> deleteCustomer()
  {
	  customerService.deleteAllCustomers();
	  return new ResponseEntity<String>("Deleted All Customers",HttpStatus.OK);
  }
  @PutMapping("/transaction")
  public ResponseEntity<String> transeferAmount(@RequestBody Transaction transaction){
	  return new ResponseEntity<String>(customerService.transferMoney(transaction),HttpStatus.OK);
  }
}
