package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Dealer;

public interface DealerService {
	
	public String addDealer(Dealer dealer);
	public Dealer getDealer(int oid);
	public List<Dealer> getAllDealer();
	public String updateDealer(Dealer dealer);
	public String deleteDealer(int oid);
	public List<Integer> getAllOids();
}
