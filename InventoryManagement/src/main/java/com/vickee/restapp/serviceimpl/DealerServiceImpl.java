package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Dealer;
import com.vickee.restapp.repository.DealerRepo;
import com.vickee.restapp.service.DealerService;

@Service
public class DealerServiceImpl implements DealerService {
	
	@Autowired
	DealerRepo repo;

	@Override
	public String addDealer(Dealer dealer) {
		if(dealer!=null) {
		repo.save(dealer);
		return "success";
		}
		else {
			return "failed yet to be added";
		}
	}

	@Override
	public Dealer getDealer(int oid) {
		// TODO Auto-generated method stub
		Optional<Dealer> dealOptional = repo.findById(oid);
		return dealOptional.orElse(null);
	}

	@Override
	public List<Dealer> getAllDealer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String updateDealer(Dealer dealer) {
		// TODO Auto-generated method stub
		if(dealer!=null) {
			repo.save(dealer);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public String deleteDealer(int oid) {
		Optional<Dealer> dealer = repo.findById(oid);
		if(dealer.isPresent()){
		repo.deleteById(oid);
		return "success";
		}
		else {
		return "failure";
		}
	}

	@Override
	public List<Integer> getAllOids() {
		// TODO Auto-generated method stub
		return repo.fetAllOids();
	}

}
