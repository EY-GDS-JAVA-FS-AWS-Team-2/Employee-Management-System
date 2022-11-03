package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.WorkingHistory;

@Repository
public interface WorkingHistoryRepository extends JpaRepository<WorkingHistory, Long>{
	

}
