package com.id.service;

import com.id.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/29
 * @description
 */
public interface CustomerRepository extends MongoRepository<Customer,String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
