package com.id.entity;

import org.springframework.data.annotation.Id;

/**
 * @author liaoyubo
 * @version 1.0 2017/8/29
 * @description
 */
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Customer(){

    }

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
