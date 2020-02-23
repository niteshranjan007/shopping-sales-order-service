package com.shopping.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SALES_ORDER")
public class SalesOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
     
    @Column(name="order_date")
    private String orderDate;
    
    @Column(name="cust_id")
    private Long custId;
     
    @Column(name="order_desc")
    private String orderDesc;
     
    @Column(name="total_price")
    private BigDecimal totalPrice;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "order_id")
    private List<OrderLineItemEntity> orderLineItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<OrderLineItemEntity> getOrderLineItem() {
		return orderLineItem;
	}

	public void setOrderLineItem(List<OrderLineItemEntity> orderLineItem) {
		this.orderLineItem = orderLineItem;
	}

	@Override
	public String toString() {
		return "SalesOrderEntity [id=" + id + ", orderDate=" + orderDate + ", custId=" + custId + ", orderDesc="
				+ orderDesc + ", totalPrice=" + totalPrice + ", orderLineItem=" + orderLineItem + "]";
	}
    
    
}
