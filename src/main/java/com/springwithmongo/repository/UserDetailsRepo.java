package com.springwithmongo.repository;

import com.springwithmongo.document.UserDetails;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserDetailsRepo extends MongoRepository<UserDetails,String> {

    //public UserDetails findById(ObjectId _id);

}
