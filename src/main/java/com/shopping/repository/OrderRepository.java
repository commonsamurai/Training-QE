package com.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.entity.Order;


public interface OrderRepository extends MongoRepository<Order, Integer> {

}
