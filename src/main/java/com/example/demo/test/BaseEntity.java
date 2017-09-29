package com.example.demo.test;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Haris Khan on 12/8/2016.
 */
@Component
public class BaseEntity implements Serializable {

    @Id
    private ObjectId id;

    @CreatedDate
    private DateTime createdDate;

    @LastModifiedDate
    private DateTime modifiedDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

}
