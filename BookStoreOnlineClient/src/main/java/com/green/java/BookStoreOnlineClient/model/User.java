package com.green.java.BookStoreOnlineClient.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class User {
	
	@Id
	@Column(name = "ACC_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Integer age;
	private String gender;
	private String phone;
	private Integer sratus;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "ACC_ID",
			joinColumns = @JoinColumn(name = "ACC_ID"),
			inverseJoinColumns = @JoinColumn(name ="ROLE_ID"))
	private Set<Role> role = new HashSet<>();
	
}
