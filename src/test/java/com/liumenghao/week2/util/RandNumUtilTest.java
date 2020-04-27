package com.liumenghao.week2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumUtilTest {

	@Test
	public void testGetValue() {
		RandNumUtil.getValue(456.12, 789.12, 3);
	}

	@Test
	public void testRandom() {
		RandNumUtil.random(1, 3);
	}

}
