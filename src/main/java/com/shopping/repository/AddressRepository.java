package com.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.shopping.entity.Address;

public interface AddressRepository extends  MongoRepository<Address, Integer> {

}
