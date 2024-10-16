package com.learn.micro.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learn.micro.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{

}
