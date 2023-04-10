package com.pr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pr.model.student;

public interface StudentRepo extends JpaRepository<student, Integer>{

}
