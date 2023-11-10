package com.jhgpt.board.model.service;

import java.util.List;

import com.jhgpt.board.model.dto.Board;
import com.jhgpt.board.model.dto.Review;

public interface ReviewService {
	
	public List<Review> getReviewList();
	
	public void writeReview(Review review);
	
	public Review selectReview(int review_id);
	
	public void modifyReview(Review review);
	
	public void deleteReview(int review_id);

	public List<Review> getReviewsForVideo(int video_id);

	public void writeReview(int video_id, Review review);

}