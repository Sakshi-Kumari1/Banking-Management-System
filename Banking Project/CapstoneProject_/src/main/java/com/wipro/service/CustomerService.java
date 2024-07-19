package com.wipro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Account;
import com.wipro.model.Customer;
import com.wipro.model.Transaction;
import com.wipro.repository.AccountRepository;
import com.wipro.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private AccountRepository accountRepo;
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	public Customer save(Customer customer) {
		return customerRepo.save(customer);
	}
	public Customer update(Customer customer) {
		Customer existingCustomer=customerRepo.findById(customer.getCustomerid()).orElse(null);
		return customerRepo.save(existingCustomer);
	}
	public void deleteById(int customerid) {
		customerRepo.deleteById(customerid);
	}
	public String transferMoney(Transaction transaction) {
		System.out.println("Into Moneytransfer method");
		Optional<Account> debitFromAccount=accountRepo.findById(transaction.getFromaccountid());
		Optional<Account> creditToAccount=accountRepo.findById(transaction.getTargetAccountId());
		System.out.println("***********************************");
		System.out.println(debitFromAccount);
		
		int debitamount=debitFromAccount.get().getAccountbalance();
		int creditAmount=creditToAccount.get().getAccountbalance();
		
		//debit from fromAccount
		if(debitamount>=transaction.getDebitCreditAmount()) {
			debitFromAccount.get().setAccountbalance(debitamount-transaction.getDebitCreditAmount());
			accountRepo.save(debitFromAccount.get());
			
		//credit to toAccount
			creditToAccount.get().setAccountbalance(creditAmount+transaction.getDebitCreditAmount());
			accountRepo.save(creditToAccount.get());
			
			return "Ammount transferred successfully";
		}
		else {
			return"Insufficient Ammount";
		}
	}
	public Optional<Customer> getCustomerById(int customerid){
		return customerRepo.findById(customerid);
	}
	public void deleteAllCustomers() {
		customerRepo.deleteAll();
	}

}
