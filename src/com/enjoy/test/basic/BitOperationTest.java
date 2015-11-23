package com.enjoy.test.basic;

import org.junit.Test;

import com.enjoy.practice.BitOperation;

public class BitOperationTest {

	@Test
	public void testNumberOf1_1() {
		int n = 9;
		BitOperation bitOperation = new BitOperation();
		int numberOf1 = bitOperation.numberOf1_1(n);
		System.out.println(numberOf1);
	}

}
