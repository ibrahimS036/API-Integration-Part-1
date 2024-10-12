	package com.order.payment.controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	import com.order.payment.entities.OrderBean;
	import com.order.payment.paylode.RequestHandle;
	import com.order.payment.paylode.ResponseHandle;
	import com.order.payment.service.OrderService;
	
	
	@RestController
	public class OrderController {
	
		
		@Autowired
		private OrderService orderservice;
	
		@PostMapping("/insert")
		public ResponseEntity<ResponseHandle> postUser(@RequestBody RequestHandle bean) {
			System.out.println(bean);
		 ResponseHandle insert = this.orderservice.insert(bean);
			return new ResponseEntity(insert, HttpStatus.CREATED);
		}
	
	}
