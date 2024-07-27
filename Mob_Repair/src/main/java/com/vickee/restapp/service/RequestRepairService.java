package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.RequestRepair;

public interface RequestRepairService {
	
	public void addDealer(RequestRepair request);
	public RequestRepair getDealer(int oid);
	public List<RequestRepair> getAllDealer();
	public void updateDealer(RequestRepair request);
	public void deleteDealer(int oid);
	public List<Integer> getAllOids();
}
