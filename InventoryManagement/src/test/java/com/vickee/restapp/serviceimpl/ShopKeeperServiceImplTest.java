package com.vickee.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Dealer;
import com.vickee.restapp.model.ShopKeeper;

@SpringBootTest
class ShopKeeperServiceImplTest {
	
	@Autowired
	ShopKeeperServiceImpl service;
	
	@Test
	void testAddShopKeeper() {
		Dealer dealer = new Dealer(40,"Vickee","Sugar",15,450);
		ShopKeeper shop = new ShopKeeper(15,"mee_vickee","RK Agencies",984524201,dealer);
		assertEquals("success",service.addShopKeeper(shop));
	}

	@Test
	void testGetShopKeeper() {
		assertNotNull(service.getShopKeeper(5));
	}
//
	@Test
	void testGetAllShopKeeper() {
		assertNotNull(service.getAllShopKeeper());
	}
//
	@Test
	void testUpdateShopKeeper() {
		ShopKeeper sk = new ShopKeeper(15,"RK Agencies","mee_vickee",984524201,null);
		assertEquals("success",service.updateShopKeeper(sk));
	}
//
	@Test
	void testDeleteShopKeeper() {
		assertEquals("failure",service.deleteShopKeeper(9));
	}

}
