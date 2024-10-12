package com.order.payment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderId;
	private String OrderName;
	private int OrderQuantity;
	private int OrderAmount;
	
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public int getOrderQuantity() {
		return OrderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		OrderQuantity = orderQuantity;
	}
	public int getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}
	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderBean [OrderId=" + OrderId + ", OrderName=" + OrderName + ", OrderQuantity=" + OrderQuantity
				+ ", OrderAmount=" + OrderAmount + "]";
	}

	
	
	
}
