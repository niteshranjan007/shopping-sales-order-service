package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.OrderLineItemEntity;

@Repository
public interface OrderLineItemRepository extends JpaRepository<OrderLineItemEntity, Long> {

}
