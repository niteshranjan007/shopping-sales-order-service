package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.SalesOrderEntity;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrderEntity, Long> {

}
