package com.vickee.restapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vickee.restapp.model.Dealer;

@SpringBootTest
class DealerServiceTest {

	
	@Autowired
	private DealerService dealerservice;
	
	@Test
	void testAddDealer() {
		Dealer dealer = new Dealer(150,"Vickee","Oats",15,450);
		assertEquals("success",dealerservice.addDealer(dealer));
	}
	
	@Test
	void testAddDealer1() {
		Dealer dealer = null;
		assertEquals("failed yet to be added",dealerservice.addDealer(dealer));
	}
	
//	@Test
//	void testAddDealer2() {
//		Dealer dealer = new Dealer();
//		assertEquals("success",dealerservice.addDealer(dealer));
//	}

	@Test
	void testGetDealer() {
		Dealer dealer = dealerservice.getDealer(10);
		assertNotNull(dealer);
		assertEquals(10,dealer.getOid());
	}
	
	@Test
	void testGetDealer1() {
		Dealer dealer = dealerservice.getDealer(23);
		assertNotNull(dealer);
		assertEquals(23,dealer.getOid());
	}
	
	@Test
	void testGetAllDealer() {
		List<Dealer> dealer = dealerservice.getAllDealer();
		assertNotNull(dealer);
	}

	@Test
	void testUpdateDealer() {
		Dealer deal = new Dealer(33,"Velan","French Fries",30,4500);
		assertEquals("success",dealerservice.updateDealer(deal));
	}
	
	@Test
	void testUpdateDealer1() {
		Dealer deal = null;
		assertEquals("failure",dealerservice.updateDealer(deal));
	}

	@Test
	void testDeleteDealer() {
//		Dealer dealer = new Dealer();
		int id = 8;
		assertEquals("success", dealerservice.deleteDealer(id));
	}
	
	@Test
	void testDeleteDealer1() {
//		Dealer dealer = new Dealer();
		int id = 100;
		assertEquals("failure", dealerservice.deleteDealer(id));
	}

//	@Test
//	void testGetAllOids() {
//		fail("Not yet implemented");
//	}

}
