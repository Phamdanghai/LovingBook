package com.green.java.BookStoreOnlineAdmin.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.green.java.BookStoreOnlineAdmin.entity.Staff;

public class StaffDetails implements UserDetails {

	private Staff staff;

	public StaffDetails(Staff staff) {
		this.staff = staff;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		authorities.add(new SimpleGrantedAuthority("ADMIN"));

		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return staff.getStaffPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return staff.getStaffFirstName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
