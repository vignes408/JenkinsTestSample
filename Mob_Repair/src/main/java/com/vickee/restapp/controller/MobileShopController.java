package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.MobileShop;
import com.vickee.restapp.serviceimpl.MobileShopServiceImpl;

@RestController
@RequestMapping("/mobileshop")
@CrossOrigin("*")
public class MobileShopController {
	
	@Autowired
	MobileShopServiceImpl service;
	
	@PostMapping
	public void addShopKeeper(@RequestBody MobileShop shop) {
		service.addShop(shop);
	}
	@GetMapping("{id}")
	public MobileShop getShopKeeper(@PathVariable int id) {
		return service.getShop(id);
	}
	@GetMapping("/allshopkeeper")
	public List<MobileShop> getAllShopKeeper(){
		return service.getAllShop();
	}
	@DeleteMapping("{id}")
	public void deleteShopKeeper(@PathVariable int id) {
		service.deleteShop(id);
	}
	@PutMapping
	public void updateShopKeeper(@RequestBody MobileShop shop)
	{
		service.updateShop(shop);
	}
}
