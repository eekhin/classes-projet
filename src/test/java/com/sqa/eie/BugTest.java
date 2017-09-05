package com.sqa.eie;

import org.testng.annotations.*;

import com.sqa.eiei.*;

public class BugTest {

	@Test
	public void testBug() {
		Bug[] bug = new Bug[2];
		bug[0] = new Bug(1, "Jack", "Undefined", 'A', "Window10", "09/03/2017", "Undefined the error", 2, false);
		bug[1] = new Bug(2, "Warnings");
		for (int i = 0; i < bug.length; i++) {
			System.out.println("BugDetails is:" + bug[i]);
		}
	}
}