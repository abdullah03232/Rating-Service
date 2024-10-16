package com.learn.micro.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document("user_ratings")
public class Rating {
   @Id
   private String ratingid;
   private String userId;
   private String hotelId;
   private int rating;
   private String feedback;
}
