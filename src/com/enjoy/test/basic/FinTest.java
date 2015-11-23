package com.enjoy.test.basic;

import org.junit.Test;

import com.enjoy.practice.Find;

public class FinTest {

	int[] source = { 1, 2, 3, 4, 6, 7, 8, 12, 34, 56, 212 };

	@Test
	public void testOrderFind() {
		Find find = new Find();
		int position = find.orderFind(source, source.length, 8);
		System.out.println(position);
	}

	@Test
	public void testMiddleFind() {
		Find find = new Find();
		int position = find.middleFind(source, source.length, 212);
		System.out.println(position);
	}

}
