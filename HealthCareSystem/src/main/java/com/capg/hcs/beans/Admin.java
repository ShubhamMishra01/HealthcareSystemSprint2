package com.capg.hcs.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@Column(name = "adminId")
	private int adminId;
	
	@Column(name = "adminName")
	private String adminName;
	
	@Column(name = "adminPassword")
	private String adminPassword;
	
	private List<Test> listOfTest;
	
	private Appointment appointment;
	
	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<Test> getListOfTest() {
		return listOfTest;
	}

	public void setListOfTest(List<Test> listOfTest) {
		this.listOfTest = listOfTest;
	}

	public List<DiagnosticCenter> getListOfDiagnosticCenter() {
		return listOfDiagnosticCenter;
	}

	public void setListOfDiagnosticCenter(List<DiagnosticCenter> listOfDiagnosticCenter) {
		this.listOfDiagnosticCenter = listOfDiagnosticCenter;
	}

	public List<Appointment> getListOfAppointment() {
		return listOfAppointment;
	}

	public void setListOfAppointment(List<Appointment> listOfAppointment) {
		this.listOfAppointment = listOfAppointment;
	}

	private List<DiagnosticCenter> listOfDiagnosticCenter;
	private List<Appointment> listOfAppointment;
	
	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
	}

}
