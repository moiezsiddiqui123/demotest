package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by Haris Khan on 5/15/2017.
 */
@Component
public class Address {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
