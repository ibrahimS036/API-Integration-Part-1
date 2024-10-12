package com.order.payment.paylode;

import com.order.payment.entities.OrderBean;

public class ResponseHandle {

	private OrderBean orderBean;
	private String transactionId;
	private String status;
	private int amount;

	public OrderBean getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ResponseHandle [orderBean=" + orderBean + ", transactionId=" + transactionId + ", status=" + status
				+ ", amount=" + amount + "]";
	}

	

}
