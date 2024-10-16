package com.learn.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.micro.daos.RatingService;
import com.learn.micro.entities.Rating;

@RestController
@RequestMapping("rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}

	@PutMapping
	ResponseEntity<Rating> updateRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.updateRating(rating));
	}
	
	@DeleteMapping("/{ratingId}")
	ResponseEntity<String> deleteRating(@PathVariable String ratingId){
		ratingService.deleteRating(ratingId);
		return new ResponseEntity<String>("Rating has been deleted successfully",HttpStatus.OK);
	}
	
	@GetMapping("/{ratingId}")
	ResponseEntity<Rating> getSingleRating(@PathVariable String ratingId){
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getSingleRating(ratingId));
	}
	
	@GetMapping
	ResponseEntity<List<Rating>> getAllRatings(){
	return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
	
	}
	
}
