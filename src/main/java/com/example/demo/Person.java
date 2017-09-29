package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

/**
 * Created by Haris Khan on 5/14/2017.
 */
@Component
@Document(collection = "ESRC_PERSON")
public class Person extends BaseEntity {

    @Field("name")
    private String name;

    @Field("age")
    private Integer age;

    @Field("address")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
