package com.vickee.MavenExample1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testMain() {
		assertEquals(10,App.Addition(5, 5));
	}

}
