package com.capg.hcs.beans;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Test")
public class Test {
	@Id
	@Column(name="testId")
	private String testId;
	
	static int id;
	
	private List<Appointment> listofAppointment;
	
	public List<Appointment> getListofAppointment() {
		return listofAppointment;
	}
	public void setListofAppointment(List<Appointment> listofAppointment) {
		this.listofAppointment = listofAppointment;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		id = id++;
	}
	@Column(name="testName")
	private String testName;
	@Column(name="testPrice")
	private int testPrice;
	
	public Test() {
		super();
	}
	public Test(String testName) {
		this.id=this.id++;
		this.testId = testId+(id++);
		this.testName = testName;
		this.testPrice = testPrice;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(int testPrice) {
		this.testPrice = testPrice;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", testPrice=" + testPrice + "]";
	}
	
	
}
