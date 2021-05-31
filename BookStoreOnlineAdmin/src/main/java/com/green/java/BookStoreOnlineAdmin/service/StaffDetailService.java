package com.green.java.BookStoreOnlineAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.java.BookStoreOnlineAdmin.dao.StaffRepository;
import com.green.java.BookStoreOnlineAdmin.entity.Staff;
import com.green.java.BookStoreOnlineAdmin.helper.Announcement;
import com.green.java.BookStoreOnlineAdmin.security.StaffDetails;

public class StaffDetailService implements UserDetailsService {

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Staff staff = staffRepository.getStaffByFirstName(username);

		System.out.println("-------------  " + username + "  -------------");

		if (staff == null) {
			System.out.println("loadUserByUsername with not found username");
			throw new UsernameNotFoundException(Announcement.usernameNotFound);
		}
		return new StaffDetails(staff);
	}

}
