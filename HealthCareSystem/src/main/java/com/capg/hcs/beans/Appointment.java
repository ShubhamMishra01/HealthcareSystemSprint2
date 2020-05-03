package com.capg.hcs.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")

public class Appointment {
	@Id
	@Column(name = "appointmentId")
	private int appointmentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="appointmentId")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="testId")
	private Test test;

	@Column(name = "appointmentStatus")
	private boolean approved;

	@Column(name = "dateTime")
	private Date dateTime;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Appointment(int appointmentId, boolean approved, Date dateTime) {
		super();
		this.appointmentId = appointmentId;
		this.approved = approved;
		this.dateTime = dateTime;
	}

	public Appointment() {
		super();
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentStatus=" + approved + ", dateTime="
				+ dateTime + "]";
	}

}
