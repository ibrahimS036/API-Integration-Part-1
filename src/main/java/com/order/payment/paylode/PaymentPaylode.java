package com.order.payment.paylode;

public class PaymentPaylode {

	private int PaymentId;
	private String TransactionId;
	private String PaymentStatus;
	private int OrderId;
	private int OrderAmount;

	public int getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}

	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}

	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "PaymentPaylode [PaymentId=" + PaymentId + ", TransactionId=" + TransactionId + ", PaymentStatus="
				+ PaymentStatus + ", OrderId=" + OrderId + ", OrderAmount=" + OrderAmount + "]";
	}

}
