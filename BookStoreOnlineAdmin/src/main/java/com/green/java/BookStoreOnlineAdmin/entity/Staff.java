package com.green.java.BookStoreOnlineAdmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAFF")
public class Staff {
	@Id
	@Column(name = "STAFF_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer staffID;

	@Column(name = "EMAIL")
	private String staffEmail;

	@Column(name = "PASSWORD")
	private String staffPassword;

	@Column(name = "FIRST_NAME")
	private String staffFirstName;

	@Column(name = "LAST_NAME")
	private String staffLastName;

	@Column(name = "AGE")
	private Integer staffAge;

	@Column(name = "GENDER")
	private String staffGender;

	@Column(name = "PHONE_NUMBER")
	private String staffPhoneNumber;

	@Column(name = "STATUS")
	private Boolean status;

	public Staff() {
	}

	public Staff(Integer staffID, String staffEmail, String staffPassword, String staffFirstName, String staffLastName,
			Integer staffAge, String staffGender, String staffPhoneNumber, Boolean status) {
		super();
		this.staffID = staffID;
		this.staffEmail = staffEmail;
		this.staffPassword = staffPassword;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffAge = staffAge;
		this.staffGender = staffGender;
		this.staffPhoneNumber = staffPhoneNumber;
		this.status = status;
	}

	public Staff(Integer staffID, String staffEmail, String staffFirstName, String staffLastName, Integer staffAge,
			String staffGender, String staffPhoneNumber, Boolean status) {
		super();
		this.staffID = staffID;
		this.staffEmail = staffEmail;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffAge = staffAge;
		this.staffGender = staffGender;
		this.staffPhoneNumber = staffPhoneNumber;
		this.status = status;
	}

	public Integer getStaffID() {
		return staffID;
	}

	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Integer getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(Integer staffAge) {
		this.staffAge = staffAge;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getStaffPhoneNumber() {
		return staffPhoneNumber;
	}

	public void setStaffPhoneNumber(String staffPhoneNumber) {
		this.staffPhoneNumber = staffPhoneNumber;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
