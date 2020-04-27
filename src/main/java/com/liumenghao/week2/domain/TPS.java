package com.liumenghao.week2.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {
	private BigInteger  id;
	private String name;
	private int age;
	private BigDecimal xin;
	private Date time;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getXin() {
		return xin;
	}
	public void setXin(BigDecimal xin) {
		this.xin = xin;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", xin=" + xin + ", time=" + time + "]";
	}
	
}
