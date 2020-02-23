package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.exception.RecordNotFoundException;
import com.shopping.model.SalesOrderRequest;
import com.shopping.model.SalesOrderResponse;
import com.shopping.service.SalesOrderService;

@RestController
@RequestMapping("/orders")
public class SalesOrderController {
	
	    @Autowired
	    SalesOrderService service;
	    
	    @PostMapping
	    public ResponseEntity<SalesOrderResponse> createOrder(@RequestBody SalesOrderRequest Customer) throws RecordNotFoundException {
	    	SalesOrderResponse updated = service.createOrder(Customer);
	    	
	        return new ResponseEntity<SalesOrderResponse>(updated, new HttpHeaders(), HttpStatus.OK);
	    }

}
