package com.green.java.BookStoreOnlineAdmin.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.green.java.BookStoreOnlineAdmin.entity.Staff;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer> {

	@Query("SELECT staff FROM Staff staff WHERE staff.staffFirstName = :staffFirstName")
	public Staff getStaffByFirstName(@Param("staffFirstName") String staffFirstName);

}
