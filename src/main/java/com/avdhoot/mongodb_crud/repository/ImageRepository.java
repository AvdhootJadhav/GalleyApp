package com.avdhoot.mongodb_crud.repository;


import com.avdhoot.mongodb_crud.model.Image;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends MongoRepository<Image,String> {

    
}
