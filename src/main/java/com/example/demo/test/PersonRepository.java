package com.example.demo.test;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Haris Khan on 5/14/2017.
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, ObjectId> {

}
