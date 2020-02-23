package com.shopping.model;

import java.util.List;

public class SalesOrderRequest {
	
	private Long customerId;
	private String orderDate;
	private String orderDescription;
	private List<String> itemNames;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public List<String> getItemNames() {
		return itemNames;
	}
	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}
	@Override
	public String toString() {
		return "SalesOrderRequest [customerId=" + customerId + ", orderDate=" + orderDate + ", orderDescription="
				+ orderDescription + ", itemNames=" + itemNames + "]";
	}	

}
