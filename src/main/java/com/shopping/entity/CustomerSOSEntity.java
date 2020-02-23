package com.shopping.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_SOS")
public class CustomerSOSEntity implements Serializable {
    private static final long serialVersionUID = 1L;
	
    @Id
    @Column(name="cust_id")
    private Long custId;
     
    @Column(name="cust_first_name")
    private String custFirstName;
     
    @Column(name="custLast_name")
    private String lastName;
     
    @Column(name="cust_email")
    private String custEmail;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	@Override
	public String toString() {
		return "CustomerSOSEntity [custId=" + custId + ", custFirstName=" + custFirstName + ", lastName=" + lastName
				+ ", custEmail=" + custEmail + "]";
	}

	   
    
}
