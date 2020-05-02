package com.capg.hcs.beans;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")

public class Appointment {
	@Id
	@Column(name = "appointmentid")
	private int appointmentId;
	
	private Customer customer;
	
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
	public DiagnosticCenter getDiagonisticCenter() {
		return diagonisticCenter;
	}
	public void setDiagonisticCenter(DiagnosticCenter diagonisticCenter) {
		this.diagonisticCenter = diagonisticCenter;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	private Test test;
	
	private DiagnosticCenter diagonisticCenter;
	
	@Column(name = "appointmentStatus")
	private boolean approved;
	
	@Column(name = "dateTime")
	private Date dateTime;
	
	@Column(name = "diagnosticCenter")
	private DiagnosticCenter diagnosticCenter;
	
	
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
	public DiagnosticCenter getDiagnosticCenter() {
		return diagnosticCenter;
	}
	public void setDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}
	public Appointment(int appointmentId, boolean approved, Date dateTime, DiagnosticCenter diagnosticCenter) {
		super();
		this.appointmentId = appointmentId;
		this.approved = approved;
		this.dateTime = dateTime;
		this.diagnosticCenter = diagnosticCenter;
	}
	public Appointment() {
		super();
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentStatus=" + approved
				+ ", dateTime=" + dateTime + ", diagnosticCenter=" + diagnosticCenter + "]";
	}
	
	


}
