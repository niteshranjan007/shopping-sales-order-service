package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.CustomerSOSEntity;

@Repository
public interface CustomerSOSRepository extends JpaRepository<CustomerSOSEntity, Long> {

}
