package com.ba.beans;

public class Company {

	private String companyName;
	private String companyCode;
	private String companyLocation;

	public String companyStatus(int clientId) {
		if (clientId > 5)
			return "active";
		else
			return "inactive";
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyCode=" + companyCode + ", companyLocation="
				+ companyLocation + "]";
	}

}
