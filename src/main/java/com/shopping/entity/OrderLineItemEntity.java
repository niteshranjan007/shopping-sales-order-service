package com.shopping.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class OrderLineItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private Long id;
     
    @Column(name="item_name")
    private String itemName;
     
    @Column(name="item_quantity")
    private Long itemQuantity;
    
    @Column(name="order_id")
    private Long orderId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "OrderLineItemEntity [id=" + id + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity
				+ ", orderId=" + orderId + "]";
	}	
}
