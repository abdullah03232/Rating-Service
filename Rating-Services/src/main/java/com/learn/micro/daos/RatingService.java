package com.learn.micro.daos;

import java.util.List;

import com.learn.micro.entities.Rating;

public interface RatingService {

	// create rating
	Rating createRating(Rating rating);

	// update rating
	Rating updateRating(Rating rating);

	// detele rating
	void deleteRating(String ratingId);

	// get single rating
	Rating getSingleRating(String ratingId);

	// get all ratings
	List<Rating> getAllRating();
}
