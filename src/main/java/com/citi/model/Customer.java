package com.citi.model;

import lombok.Data;

/**
 * Customer pojo java class is having @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */

@Data
public class Customer {
	private Long custId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNo;
	private String ssnNo;
	
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(String ssnNo) {
		this.ssnNo = ssnNo;
	}

}
