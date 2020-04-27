package com.liumenghao.week2.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZHStringUtilTest {

	@Test
	public void testGetZHString() {
		String zhString = ZHStringUtil.getZHString(6);
		System.out.println(zhString);
	}

	@Test
	public void testGetZHName() {
		String zhName = ZHStringUtil.getZHName();
		System.out.println(zhName);
	}

}
