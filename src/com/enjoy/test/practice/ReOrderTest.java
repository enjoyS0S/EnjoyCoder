package com.enjoy.test.practice;

import org.junit.Test;

import com.enjoy.practice.Reorder;

public class ReOrderTest {

	private int[] source = { 1, 8, 2, 9, 3, 5, 7, 6 };

	@Test
	public void testReorderOddEven_0() {
		Reorder reorder = new Reorder();
		int[] order = reorder.reorderOddEven_0(source, source.length);
		for (int i : order) {
			System.out.print(i + " ");
		}
	}

	@Test
	public void testReorderOddEven_1() {
		Reorder reorder = new Reorder();
		int[] order = reorder.reorderOddEven_1(source, source.length);
		for (int i : order) {
			System.out.print(i + " ");
		}
		String name = "name";
		String yourName = "yourName";
		System.out.println(String.format("Hi %s, my name is %s", name, yourName));
	}

}
