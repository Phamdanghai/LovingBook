package com.green.java.BookStoreOnlineClient.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.green.java.BookStoreOnlineClient.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	@Query("SELECT customer FROM Customer customer WHERE customer.customerFirstName = :customerFirstName")
	public Customer getCustomerByFirstName(@Param("customerFirstName") String customerFirstName);
}
