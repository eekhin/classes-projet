package com.sqa.eie;

import org.testng.annotations.*;

import com.sqa.eiei.*;

public class BugTest {

	@Test
	public void testBug() {
		Bug bug = new Bug();
		System.out.println("BugDetails is:" + bug);
	}
}
