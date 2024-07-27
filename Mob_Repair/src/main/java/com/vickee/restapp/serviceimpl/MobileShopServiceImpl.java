package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.MobileShop;
import com.vickee.restapp.repository.MobileShopRepo;
import com.vickee.restapp.service.MobileShopService;

@Service
public class MobileShopServiceImpl implements MobileShopService {
	
	@Autowired
	MobileShopRepo repo;
	@Override
	public void addShop(MobileShop shop) {
		// TODO Auto-generated method stub
		repo.save(shop);
		
	}

	@Override
	public MobileShop getShop(int mid) {
		// TODO Auto-generated method stub
		return repo.findById(mid).get();
	}

	@Override
	public List<MobileShop> getAllShop() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateShop(MobileShop shop) {
		// TODO Auto-generated method stub
		repo.save(shop);
	}

	@Override
	public void deleteShop(int mid) {
		// TODO Auto-generated method stub
		repo.deleteById(mid);
		
	}

}
