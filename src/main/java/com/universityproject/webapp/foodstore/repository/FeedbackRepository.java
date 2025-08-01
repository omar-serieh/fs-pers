package com.universityproject.webapp.foodstore.repository;


import com.universityproject.webapp.foodstore.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}