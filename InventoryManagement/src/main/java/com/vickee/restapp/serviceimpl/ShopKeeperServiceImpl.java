package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.ShopKeeper;
import com.vickee.restapp.repository.ShopKeeperRepo;
import com.vickee.restapp.service.ShopKeeperService;

@Service
public class ShopKeeperServiceImpl implements ShopKeeperService {
	
	@Autowired
	ShopKeeperRepo repo;
	
	@Override
	public String addShopKeeper(ShopKeeper shop) {
		if(shop!=null) {
		repo.save(shop);
		return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public ShopKeeper getShopKeeper(int sid) {
		// TODO Auto-generated method stub
		Optional<ShopKeeper> shopOptional = repo.findById(sid);
		return shopOptional.orElse(null);
	}

	@Override
	public List<ShopKeeper> getAllShopKeeper() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String updateShopKeeper(ShopKeeper shop) {
		// TODO Auto-generated method stub
		if(shop!=null) {
			repo.save(shop);
			return "success";
			}
			else {
				return "failure";
			}
	}

	@Override
	public String deleteShopKeeper(int sid) {
		// TODO Auto-generated method stub
		Optional<ShopKeeper> shop = repo.findById(sid);
		if(shop.isPresent()) {
			repo.deleteById(sid);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

}
