package com.wipro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
