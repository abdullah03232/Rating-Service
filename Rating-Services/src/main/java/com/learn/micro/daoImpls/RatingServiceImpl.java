package com.learn.micro.daoImpls;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.micro.daos.RatingService;
import com.learn.micro.entities.Rating;
import com.learn.micro.exceptions.ResourceNotFound;
import com.learn.micro.repositories.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository repository;
	
	@Override
	public Rating createRating(Rating rating) {
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingid(ratingId);
		return repository.save(rating);
	}

	@Override
	public Rating updateRating(Rating rating) {
		Rating data = repository.findById(rating.getRatingid()).orElseThrow(() -> new ResourceNotFound());
		return repository.save(rating);
	}

	@Override
	public void deleteRating(String ratingId) {
		repository.deleteById(ratingId);
		
	}

	@Override
	public Rating getSingleRating(String ratingId) {
		return repository.findById(ratingId).orElseThrow(() -> new ResourceNotFound());
	}

	@Override
	public List<Rating> getAllRating() {
		return repository.findAll();
	}

}
