package com.order.payment.paylode;

import com.order.payment.entities.OrderBean;

public class RequestHandle {

	private OrderBean orderBean;
	private PaymentPaylode paymentpaylode;

	public OrderBean getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}

	public PaymentPaylode getPaymentpaylode() {
		return paymentpaylode;
	}

	public void setPaymentpaylode(PaymentPaylode paymentpaylode) {
		this.paymentpaylode = paymentpaylode;
	}

	@Override
	public String toString() {
		return "RequestHandle [orderBean=" + orderBean + ", paymentpaylode=" + paymentpaylode + "]";
	}

}
