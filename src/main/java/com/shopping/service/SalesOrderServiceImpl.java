package com.shopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.client.ItemServiceClient;
import com.shopping.entity.CustomerSOSEntity;
import com.shopping.exception.RecordNotFoundException;
import com.shopping.model.SalesOrderRequest;
import com.shopping.model.SalesOrderResponse;
import com.shopping.repository.CustomerSOSRepository;
import com.shopping.repository.OrderLineItemRepository;
import com.shopping.repository.SalesOrderRepository;


@Service
public class SalesOrderServiceImpl implements SalesOrderService {

	@Autowired
	CustomerSOSRepository customerSOSRepository;
	
	@Autowired
	OrderLineItemRepository orderLineItemRepository;
	
	@Autowired
	SalesOrderRepository salesOrderRepository;
	
	@Autowired
	ItemServiceClient itemServiceClient;
     
    public SalesOrderResponse createOrder(SalesOrderRequest salesOrderRequest) throws RecordNotFoundException {
        Optional<CustomerSOSEntity> customer = customerSOSRepository.findById(salesOrderRequest.getCustomerId());
         
        if(customer.isPresent()) 
        {
           
        } else {
        	throw new RecordNotFoundException("No customer record exist for given id");
        }
		return null;
    } 
}