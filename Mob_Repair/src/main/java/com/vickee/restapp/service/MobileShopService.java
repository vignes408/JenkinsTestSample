package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.MobileShop;

public interface MobileShopService {
	
	public void addShop(MobileShop shop);
	public MobileShop getShop(int sid);
	public List<MobileShop> getAllShop();
	public void updateShop(MobileShop shop);
	public void deleteShop(int sid);
}
