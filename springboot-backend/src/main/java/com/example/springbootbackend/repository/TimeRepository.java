package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long>{

}
