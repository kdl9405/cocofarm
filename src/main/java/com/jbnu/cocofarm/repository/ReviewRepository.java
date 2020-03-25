package com.jbnu.cocofarm.repository;

import com.jbnu.cocofarm.domain.Review;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ReviewRepository
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {

}