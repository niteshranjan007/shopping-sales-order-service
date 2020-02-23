package com.shopping.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.CustomerSOSEntity;
import com.shopping.model.Customer;
import com.shopping.repository.CustomerSOSRepository;

@Service
public class RabbitMQConsumer {
	
	@Autowired
	CustomerSOSRepository repo;

	@RabbitListener(queues = "${shopping.rabbitmq.queue}")
	public void recievedMessage(Customer customer) {
		System.out.println("Recieved Message From RabbitMQ: " + customer);
		CustomerSOSEntity em = new CustomerSOSEntity();
		em.setCustId(customer.getId());
		em.setCustFirstName(customer.getFirstName());
		em.setLastName(customer.getLastName());
		em.setCustEmail(customer.getEmail());
		repo.save(em);
		System.out.println("Data Inserted");
	}
}