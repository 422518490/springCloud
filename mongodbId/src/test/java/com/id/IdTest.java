package com.id;

import com.id.entity.Customer;
import com.id.service.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/29
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class IdTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void mongodbIdTest(){
        Customer customer = new Customer("zhang","xiangMing");
        customer = customerRepository.save(customer);
        System.out.println("mongdbId:" + customer.getId());
    }

}
