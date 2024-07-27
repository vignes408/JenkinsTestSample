package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.RequestRepair;
import com.vickee.restapp.repository.RepairRequestRepo;
import com.vickee.restapp.service.RequestRepairService;

@Service
public class RequestRepairServiceImpl implements RequestRepairService {
	
	@Autowired
	RepairRequestRepo repo;

	@Override
	public void addDealer(RequestRepair request) {
		// TODO Auto-generated method stub
		repo.save(request);
	}

	@Override
	public RequestRepair getDealer(int oid) {
		// TODO Auto-generated method stub
		return repo.findById(oid).get();
	}

	@Override
	public List<RequestRepair> getAllDealer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateDealer(RequestRepair request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDealer(int oid) {
		// TODO Auto-generated method stub
		repo.deleteById(oid);
	}

	@Override
	public List<Integer> getAllOids() {
		// TODO Auto-generated method stub
		return repo.fetAllOids();
	}

}
