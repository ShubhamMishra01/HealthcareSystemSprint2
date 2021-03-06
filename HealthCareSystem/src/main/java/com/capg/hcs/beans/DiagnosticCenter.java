package com.capg.hcs.beans;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DiagnosticCenter")
public class DiagnosticCenter {

	@Id
	@Column(name = "centreId")
	private String centreId;

	static int id;

	@Column(name = "centreName")
	private String centreName;

	@Column(name = "centrePhoneNumber")
	private long centrePhonenumber;

	@Column(name = "centreAddress")
	private String centreAddress;

	public static void setId(int id) {
		DiagnosticCenter.id = id;
	}

	public String getCentreId() {
		return centreId;
	}

	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public long getCentrePhonenumber() {
		return centrePhonenumber;
	}

	public void setCentrePhonenumber(long centrePhonenumber) {
		this.centrePhonenumber = centrePhonenumber;
	}

	public String getCentreAddress() {
		return centreAddress;
	}

	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}

	public DiagnosticCenter(String centreId, String centreName, long centrePhonenumber, String centreAddress) {
		super();
		this.centreId = centreId;
		this.centreName = centreName;
		this.centrePhonenumber = centrePhonenumber;
		this.centreAddress = centreAddress;
	}

	public DiagnosticCenter() {
		super();
	}

	@Override
	public String toString() {
		return "DiagnosticCenter [centreId=" + centreId + ", centreName=" + centreName + ", centrePhonenumber="
				+ centrePhonenumber + ", centreAddress=" + centreAddress + "]";
	}

}
