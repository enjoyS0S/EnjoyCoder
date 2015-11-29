package com.enjoy.test.practice;

import org.junit.Test;

import com.enjoy.practice.UglyNumber;

public class UglyNumberTest {

	@Test
	public void testUglyNumber_01() {
		long startTime = System.currentTimeMillis();
		UglyNumber number = new UglyNumber();
		int uglyNumber = number.getUglyNumber_01(1500);
		long endTime = System.currentTimeMillis();
		float offsetTime = (endTime - startTime) / 1000.0000f;
		System.out.println(offsetTime);
		System.out.println(uglyNumber);
	}

	@Test
	public void testUglyNumber_02() {
		long startTime = System.currentTimeMillis();
		UglyNumber number = new UglyNumber();
		int uglyNumber = number.getUglyNumber_02(1500);
		long endTime = System.currentTimeMillis();
		float offsetTime = (endTime - startTime) / 1000.0000f;
		System.out.println(offsetTime);
		System.out.println(uglyNumber);
	}

}
