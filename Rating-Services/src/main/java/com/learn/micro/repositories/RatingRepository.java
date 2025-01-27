package com.learn.micro.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learn.micro.entities.Rating;
import java.util.List;


@Repository
public interface RatingRepository extends MongoRepository<Rating, String>{
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
