package com.wipro.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.model.Account;
import com.wipro.model.Customer;
import com.wipro.repository.CustomerRepository;
import com.wipro.service.CustomerService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CustomerServiceTest {
	@InjectMocks
	CustomerService customerService;
	
	@Mock
	CustomerRepository customerRepo;
	
	@Test
	public void updateCustomerTest() {
		Customer existingcustomer=customerRepo.findById(1).orElse(getCustomer());
	existingcustomer.setCustomername("Shakshi");
	when(customerRepo.save(any())).thenReturn(existingcustomer);
	
	Customer customerUpdated=customerService.update(existingcustomer);
	assertEquals(existingcustomer,customerUpdated);
	}
	
	@Test
	public void addCustomerTest() {
		Customer expectedcustomer=getCustomer();
		
		when(customerRepo.save(any())).thenReturn(expectedcustomer);
		Customer actual=customerService.save(expectedcustomer);
		assertEquals(expectedcustomer,actual);
		
		
	}
	@Test
	public void deleteCustomerTest() {
		Customer customer1=new Customer();
		customer1.setCustomerid(1);
		customer1.setCustomername("sha");
		customer1.setCityname("Hajipur");
		customer1.setMobileno(6299);
		customer1.setAccounts(getAccountList());
		
		customerService.deleteById(1);
		verify(customerRepo,times(1)).deleteById(1);
		}
	@Test
	public void deleteAllCustomersTest()
	{
		customerService.deleteAllCustomers();
		verify(customerRepo,times(1)).deleteAll();
	}
	@Test
	public void getCustomerByIdTest() {
		Optional<Customer> customer=getCustomerById();
		when(customerRepo.findById(1)).thenReturn(customer);
		Optional<Customer> actual=customerService.getCustomerById(1);
		assertEquals(customer,actual);
	}
	public Optional<Customer> getCustomerById(){
		Customer customer1=new Customer();
		customer1.setCustomerid(1);
		customer1.setCustomername("sha");
		customer1.setCityname("Hajipur");
		customer1.setMobileno(6299);
		customer1.setAccounts(getAccountList());
		return Optional.of(customer1);
	}
	@Test
	public void getAllCustomersTest() {
		List<Customer> expected=getCustomerList();
		when(customerRepo.findAll()).thenReturn(expected);
		List<Customer> actual=customerService.getAllCustomers();
		assertEquals(expected,actual);
	}
	public Customer getCustomer() {
		Customer customer1=new Customer();
		customer1.setCustomerid(1);
		customer1.setCustomername("sha");
		customer1.setCityname("Hajipur");
		customer1.setMobileno(6299);
		customer1.setAccounts(getAccountList());
		
		return customer1;
		
	}
	
	public List<Customer> getCustomerList(){
		List<Customer> customerlist=new ArrayList<Customer>();
		Customer customer1=new Customer();
		customer1.setCustomerid(1);
		customer1.setCustomername("sha");
		customer1.setCityname("Hajipur");
		customer1.setMobileno(6299);
		customer1.setAccounts(getAccountList());
		
		customerlist.add(customer1);
		return customerlist;
	}
	
	public List<Account> getAccountList(){
		List<Account> accountlist=new ArrayList<Account>();
		Account account1=new Account();
		
		account1.setAccountid(101);
		account1.setAccountno(1001);
		account1.setAccounttype("savings");
		account1.setAccountbalance(5000);
		
		Account account2=new Account();
		
		account2.setAccountid(102);
		account2.setAccountno(1002);
		account2.setAccounttype("current");
		account2.setAccountbalance(7000);
		
		accountlist.add(account1);
		accountlist.add(account2);
		
		return accountlist;
		
	}
	
}
