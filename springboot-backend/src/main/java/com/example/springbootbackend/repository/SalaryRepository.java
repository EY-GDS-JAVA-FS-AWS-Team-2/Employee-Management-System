package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary,Long>{

}
