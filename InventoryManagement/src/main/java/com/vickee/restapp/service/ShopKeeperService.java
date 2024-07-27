package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.ShopKeeper;

public interface ShopKeeperService {
	
	public String addShopKeeper(ShopKeeper shop);
	public ShopKeeper getShopKeeper(int sid);
	public List<ShopKeeper> getAllShopKeeper();
	public String updateShopKeeper(ShopKeeper shop);
	public String deleteShopKeeper(int sid);
}
