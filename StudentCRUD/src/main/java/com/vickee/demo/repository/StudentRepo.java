package com.vickee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.demo.bean.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	
	
	
	
}
