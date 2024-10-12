package com.order.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.order.payment.Repo.OrderRepo;
import com.order.payment.entities.OrderBean;
import com.order.payment.paylode.PaymentPaylode;
import com.order.payment.paylode.RequestHandle;
import com.order.payment.paylode.ResponseHandle;

@Service
public class OrderService {

	@Autowired
	private RestTemplate template;

	@Autowired
	private OrderRepo orderrepo;

	// insert
	public ResponseHandle insert(RequestHandle bean) {
		OrderBean orderBean = bean.getOrderBean();
		PaymentPaylode paymentpaylode = bean.getPaymentpaylode();

		paymentpaylode.setOrderId(orderBean.getOrderId());
		paymentpaylode.setOrderAmount(orderBean.getOrderAmount());

		PaymentPaylode postForObject = template.postForObject("http://localhost:8585/insert", paymentpaylode,
				PaymentPaylode.class);

		OrderBean save = orderrepo.save(orderBean);

		ResponseHandle responseHandle = new ResponseHandle();

		responseHandle.setOrderBean(orderBean);
		responseHandle.setAmount(postForObject.getOrderAmount());
		responseHandle.setTransactionId(postForObject.getTransactionId());
		responseHandle.setStatus(postForObject.getPaymentStatus());
		// OrderBean save = this.orderrepo.save(bean);
		return responseHandle;
	}

}
