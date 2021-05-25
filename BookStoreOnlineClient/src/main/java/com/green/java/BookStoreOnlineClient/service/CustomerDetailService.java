package com.green.java.BookStoreOnlineClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.java.BookStoreOnlineClient.dao.CustomerRepository;
import com.green.java.BookStoreOnlineClient.entity.Customer;
import com.green.java.BookStoreOnlineClient.help.Annoucement;
import com.green.java.BookStoreOnlineClient.security.CustomerDetail;

public class CustomerDetailService implements UserDetailsService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = customerRepository.getCustomerByFirstName(username);

		System.out.println("-------------  " + username + "  -------------");

		if (customer == null) {
			System.out.println("loadUserByUsername with not found username");
			throw new UsernameNotFoundException(Annoucement.usernameNotFound);
		}
		return new CustomerDetail(customer);
	}
}
