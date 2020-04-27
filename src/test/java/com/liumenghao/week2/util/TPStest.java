package com.liumenghao.week2.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.junit.Test;

import com.liumenghao.week2.domain.TPS;

public class TPStest {

	/**
	 * 
	 * @Title: test 
	 * @Description:随机生成100个TPS对象
	 * @return: void
	 */
	
	@Test
	public void test() {
		
		
		for (int i = 1; i <=100; i++) {//for循环100次
			TPS tps=new TPS();//创建对象
			BigInteger ix=BigInteger.valueOf(i);
			//赋值
			tps.setId(ix);
			tps.setName(ZHStringUtil.getZHName());
			tps.setAge(RandNumUtil.random(1, 100));
			tps.setXin(BigDecimal.valueOf(RandNumUtil.getValue(30000, 80000, 2)));
			tps.setTime(DateUtil.randomDate(new Date(2012-01-01),new Date()));
			//输出
			System.out.println(tps);
		}
	}

}
