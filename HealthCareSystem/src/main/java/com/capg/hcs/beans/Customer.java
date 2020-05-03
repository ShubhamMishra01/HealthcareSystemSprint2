package com.capg.hcs.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@Column(name = "customerId")
	private String customerId;

	static int id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "appointmentId", referencedColumnName = "appointmentId")
	private UserAppointmentList userAppointmentList;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "testId", referencedColumnName = "testId")
	private Test test;
	
	@Column(name = "customerName")
	private String customerName;

	@Column(name = "customerAge")
	private int customerAge;

	@Column(name = "customerGender")
	private String customerGender;

	@Column(name = "customerPhonenumber")
	private long customerPhonenumber;

	@Column(name = "customerPassword")
	private String customerPassword;

	@Column(name = "customerEmail")
	private String customerEmail;

	public Customer() {
		super();
	}

	public Customer(String customerId, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
	}

	public Customer(String customerId, String customerName, int customerAge, String customerGender,
			long customerPhonenumber, String customerPassword, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerGender = customerGender;
		this.customerPhonenumber = customerPhonenumber;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", customerGender=" + customerGender + ", customerPhonenumber=" + customerPhonenumber
				+ ", customerPassword=" + customerPassword + ", customerEmail=" + customerEmail + "]";
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId + (id++);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public long getCustomerPhonenumber() {
		return customerPhonenumber;
	}

	public void setCustomerPhonenumber(long customerPhonenumber) {
		this.customerPhonenumber = customerPhonenumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public static void setId(int id) {
		id = id++;
	}

	public UserAppointmentList getUserAppointmentList() {
		return userAppointmentList;
	}

	public void setUserAppointmentList(UserAppointmentList userAppointmentList) {
		this.userAppointmentList = userAppointmentList;
	}

}