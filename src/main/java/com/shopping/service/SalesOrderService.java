package com.shopping.service;

import com.shopping.exception.RecordNotFoundException;
import com.shopping.model.SalesOrderRequest;
import com.shopping.model.SalesOrderResponse;

public interface SalesOrderService {
	
	public SalesOrderResponse createOrder(SalesOrderRequest salesOrderRequest) throws RecordNotFoundException;

}
