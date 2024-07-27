package com.vickee.restapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.RequestRepair;

@Repository
public interface RepairRequestRepo extends JpaRepository<RequestRepair, Integer>{
	
	@Query("select oid from rep_tbl")
	List<Integer> fetAllOids();
}
