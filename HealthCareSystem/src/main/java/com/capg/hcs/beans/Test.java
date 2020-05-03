package com.capg.hcs.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test {
	@Id
	@Column(name = "testId")
	private String testId;

	static int id;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "appointmentId", referencedColumnName = "appointmentId")
	private Appointment appointment;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "centreId", referencedColumnName = "centreId")
	private DiagnosticCenter diagonisticCenter;

	@Column(name = "testName")
	private String testName;

	@Column(name = "testPrice")
	private int testPrice;

	public Test() {
		super();
	}

	public Test(String testId, String testName, int testPrice) {
		this.id = this.id++;
		this.testId = testId + (id++);
		this.testName = testName;
		this.testPrice = testPrice;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		id = id++;
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
